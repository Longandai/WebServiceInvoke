package com.core.result.prase;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * DOM½âÎö
 * @author Long
 *
 */
public class XMLParseByDOM implements Parse {
//	public static final String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
//			"<OUTPUT><ROWSET><NAME>HM_MTL_GENERAL</NAME><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LRT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZY-QE3GD2(20Y)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302257</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LQT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZT-QE3GD2(12T)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302178</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28LPT18</MATERIAL_CODE><MATERIAL_DESCRITION>JZT-QE3BD2(12T)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013120996302078</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511NM0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-E900C1</MATERIAL_DESCRITION><ROW_ID>2013120996121980</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511MV0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-L902C1(YJ)</MATERIAL_DESCRITION><ROW_ID>2013112992438057</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511LV0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-C291(YJ)</MATERIAL_DESCRITION><ROW_ID>2013112992437985</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FC511KM0L</MATERIAL_CODE><MATERIAL_DESCRITION>CXW-200-L902C1</MATERIAL_DESCRITION><ROW_ID>2013112791485796</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW><ROW><CREATED>2014-01-06</CREATED><MATERIAL_CODE>FB28L6T0M</MATERIAL_CODE><MATERIAL_DESCRITION>JZR-Q30(7R)(¼ì²â)</MATERIAL_DESCRITION><ROW_ID>2013121197225319</ROW_ID><LAST_UPD>2014-01-06</LAST_UPD></ROW></ROWSET></OUTPUT>";
	private String xml;
	private Set<String> tagName;
	public XMLParseByDOM(){
		tagName = new HashSet<String>();
		tagName.add("ROW_ID");
		tagName.add("CREATED");
		tagName.add("MATERIAL_CODE");
		tagName.add("MATERIAL_DESCRITION");
		tagName.add("LAST_UPD");
	}
	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}
	
	public void parse(){
		DocumentBuilderFactory b = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			 db=b.newDocumentBuilder();
			 ByteArrayInputStream ba = new ByteArrayInputStream(this.xml.getBytes("UTF-8"));
			Document  d=  db.parse(ba);
			NodeList list=d.getElementsByTagName("ROW");
			System.out.println(list.getLength());
			for(int i=0;i<list.getLength();i++){
				Element node = (Element) list.item(i);
				NodeList nl= node.getChildNodes();
				for(int ii = 0;ii<nl.getLength();ii++){
					Element n = (Element) nl.item(ii);
					System.out.println(n.getNodeName()+":"+n.getTextContent());
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
