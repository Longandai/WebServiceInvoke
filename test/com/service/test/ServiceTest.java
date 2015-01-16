package com.service.test;

import java.util.HashSet;
import org.junit.Test;
import com.core.main.InvokeContext;
import com.core.main.Invoker;
import com.core.result.prase.Parse;
import com.core.result.prase.XMLParseByDOM;
import com.core.result.prase.XMLParseByJsoup;

import static org.junit.Assert.*;
public class ServiceTest {
	@Test
	public void testInvoke(){
		try {
			InvokeContext context = new InvokeContext();
			String IN_SYS_NAME ="S00748";
			String IN_MASTER_TYPE ="HopeMDM";
			String IN_TABLE_NAME ="HM_MTL_GENERAL";
			String IN_STARTDATE ="2014-1-1";
			String IN_ENDDATE ="2015-1-1";
			String IN_PAGE ="1";
			String IN_BATCH_ID = "";
			String targetURL = "http://10.135.16.46:10201/soa-infra/services/interface/GeneralMDMDataRelease/generalmdmdatarelease_client_ep";
			context.setIN_SYS_NAME(IN_SYS_NAME);
			context.setIN_MASTER_TYPE(IN_MASTER_TYPE);
			context.setIN_TABLE_NAME(IN_TABLE_NAME);
			context.setIN_STARTDATE(IN_STARTDATE);
			context.setIN_ENDDATE(IN_ENDDATE);
			context.setIN_PAGE(IN_PAGE);
			context.setIN_BATCH_ID(IN_BATCH_ID);
			context.setTargetURL(targetURL);
			Invoker invoker = new Invoker();
			invoker.setContext(context);
			invoker.invoke();
			System.out.println("OUT_PAGE:---"+context.getOUT_PAGE().value);
			System.out.println("OUT_RETCODE:---"+context.getOUT_RETCODE().value);
			System.out.println("OUT_ALL_NUM:---"+context.getOUT_ALL_NUM().value);
			System.out.println("OUT_PAGE_CON:---"+context.getOUT_PAGE_CON().value);
			System.out.println("OUT_ALL_COUNT:---"+context.getOUT_ALL_COUNT().value);
			System.out.println("OUT_RETMSG:---"+context.getOUT_RETMSG().value);
			System.out.println("OUT_BATCH_ID:---"+context.getOUT_BATCH_ID().value);
			System.out.println("OUT_RESULT:---"+context.getOUT_RESULT().value);
			//差错校验
			if(context.getOUT_RETCODE().value.equals("E")){
				System.out.println(context.getOUT_RETMSG().value);
				return ;
			}
			//先解析第一条数据
			String flieName = "InvokeTest";
			String fileURL= "C://InvokeTest/"+flieName+context.getOUT_PAGE().value+".txt";
			Parse parse = new XMLParseByJsoup().setFileURL(fileURL);
			HashSet<String> fields = new HashSet<String>();
			fields.add("ROW_ID");
			fields.add("CREATED");
			fields.add("MATERIAL_CODE");
			fields.add("MATERIAL_DESCRITION");
			fields.add("LAST_UPD");
			parse.setXml(context.getOUT_RESULT().value);
			parse.setFields(fields);
			parse.parse();
			
			
			//解析其余数据
			int allCount =Integer.parseInt(context.getOUT_ALL_COUNT().value);
			if(allCount>1){
				for(int i =2;i<=allCount;i++){
					context.setIN_PAGE(new Integer(i).toString());
					context.setIN_BATCH_ID(context.getOUT_BATCH_ID().value);
					invoker.setContext(context);
					invoker.invoke();
					//差错校验
					if(context.getOUT_RETCODE().value.equals("E")){
						System.out.println(context.getOUT_RETMSG().value);
						return ;
					 }
					 fileURL= "C://InvokeTest/InvokeTest"+i+".txt";
					 parse= new XMLParseByJsoup().setFileURL(fileURL);
					 parse.setXml(context.getOUT_RESULT().value);
					 parse.setFields(fields);
					parse.parse();
					}
				}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
