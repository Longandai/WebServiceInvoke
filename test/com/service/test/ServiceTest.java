package com.service.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import org.junit.Test;

import com.core.general.involke.GeneralMDMDataRelease;
import com.core.general.involke.Generalmdmdatarelease_client_ep;
import com.core.general.involke.Generalmdmdatarelease_client_epLocator;
import com.core.result.prase.Parse;
import com.core.result.prase.XMLParseByDOM;
import com.core.result.prase.XMLParseByJsoup;

import static org.junit.Assert.*;
public class ServiceTest {
	@Test
	public void testService(){
		String ad = "http://10.135.16.46:10201/soa-infra/services/interface/GeneralMDMDataRelease/generalmdmdatarelease_client_ep";
		Generalmdmdatarelease_client_ep client_ep = new Generalmdmdatarelease_client_epLocator();
		GeneralMDMDataRelease md =null;
		try {
			md = client_ep.getGeneralMDMDataRelease_pt(new URL(ad));
			StringHolder OUT_PAGE = new StringHolder();
			StringHolder OUT_RESULT = new StringHolder();
			StringHolder OUT_RETCODE = new StringHolder();
			IntHolder OUT_ALL_NUM = new IntHolder();
			IntHolder OUT_PAGE_CON = new IntHolder();
			StringHolder OUT_ALL_COUNT = new StringHolder();
			StringHolder OUT_RETMSG = new StringHolder();
			StringHolder OUT_BATCH_ID = new StringHolder();
			String IN_SYS_NAME ="S00748";
			String IN_MASTER_TYPE ="HopeMDM";
			String IN_TABLE_NAME ="HM_MTL_GENERAL";
			String IN_STARTDATE ="2014-1-1";
			String IN_ENDDATE ="2015-1-1";
			String IN_PAGE ="1";
			String IN_BATCH_ID = "";
			md.process(IN_SYS_NAME, IN_MASTER_TYPE, IN_TABLE_NAME, IN_STARTDATE, IN_ENDDATE, IN_PAGE, IN_BATCH_ID, OUT_PAGE, OUT_RESULT, OUT_RETCODE, OUT_ALL_NUM, OUT_PAGE_CON, OUT_ALL_COUNT, OUT_RETMSG, OUT_BATCH_ID);
			Parse p  = new XMLParseByDOM();
			System.out.println("OUT_PAGE:---"+OUT_PAGE.value);
			System.out.println("OUT_RETCODE:---"+OUT_RETCODE.value);
			System.out.println("OUT_ALL_NUM:---"+OUT_ALL_NUM.value);
			System.out.println("OUT_PAGE_CON:---"+OUT_PAGE_CON.value);
			System.out.println("OUT_ALL_COUNT:---"+OUT_ALL_COUNT.value);
			System.out.println("OUT_RETMSG:---"+OUT_RETMSG.value);
			System.out.println("OUT_BATCH_ID:---"+OUT_BATCH_ID.value);
			System.out.println("OUT_RESULT:---"+OUT_RESULT.value);
			p.setXml(OUT_RESULT.value);
			p.parse();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		//assertTrue(true);
	}
}
