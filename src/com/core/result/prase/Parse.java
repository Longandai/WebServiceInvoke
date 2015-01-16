package com.core.result.prase;

import java.util.Set;

public abstract class Parse {
	protected String xml;
	protected Set<String> fields;
	
	
	public  void setXml(String xml){
		this.xml = xml;
		
	};
	public abstract void parse() throws Exception;
	public  void setFields(Set<String > fields){
		this.fields = fields;
	};
}
