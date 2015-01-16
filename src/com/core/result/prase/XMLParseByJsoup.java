package com.core.result.prase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
/**
 * »ùÓÚjsoup.jarµÄ½âÎö
 * @author Long
 *
 */
public class XMLParseByJsoup extends Parse{
//	public static final String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
//																"<OUTPUT><ROWSET><NAME>HM_MTL_GENERAL</NAME><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LRT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZY-QE3GD2(20Y)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302257</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LQT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZT-QE3GD2(12T)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302178</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LPT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZT-QE3BD2(12T)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302078</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511NM0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-E900C1</MATERIAL_DESCRITION><ROW_ID>2013120996121980</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511MV0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-L902C1(YJ)</MATERIAL_DESCRITION><ROW_ID>2013112992438057</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511LV0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-C291(YJ)</MATERIAL_DESCRITION><ROW_ID>2013112992437985</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511KM0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-L902C1</MATERIAL_DESCRITION><ROW_ID>2013112791485796</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28L6T0M</MATERIAL_CODE><MATERIAL_DESCRITION>JZR-Q30(7R)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013121197225319</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW></ROWSET></OUTPUT>";
	
	private String fileURL = "";
	
	public String getFileURL() {
		return fileURL;
	}
	public XMLParseByJsoup setFileURL(String fileURL) {
		this.fileURL = fileURL;
		return this;
	}
	public XMLParseByJsoup(){
		fields = new HashSet<String>();
	}
	public void parse() throws Exception{
		File  f = new File(fileURL);
		if(!f.exists()){
			f.createNewFile();
		}
		PrintStream p = new PrintStream(f);
		Document d = null;
		d=Jsoup.parse(this.xml, "", Parser.xmlParser());
		Elements list = d.select("ROW");
		System.out.println(list.size());
		p.println(list.size());
		for (Element e:list){
			System.out.println("*********************");
			p.println("*********************");
			for(String name:fields){
				System.out.println("                  "+name+":"+e.select(name).text());
				p.println("                  "+name+":"+e.select(name).text());
			}
			System.out.println("*********************");
			p.println("*********************");
		}
		System.out.println();
		p.flush();
		p.close();
	}
}
