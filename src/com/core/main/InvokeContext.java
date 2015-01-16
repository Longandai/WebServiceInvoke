package com.core.main;

import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

public class InvokeContext {
	private String targetURL;
	/**
	 * 接口输出结果
	 */
	private StringHolder OUT_PAGE = new StringHolder();
	private StringHolder OUT_RESULT = new StringHolder();
	private StringHolder OUT_RETCODE = new StringHolder();
	private IntHolder OUT_ALL_NUM = new IntHolder();
	private IntHolder OUT_PAGE_CON = new IntHolder();
	private StringHolder OUT_ALL_COUNT = new StringHolder();
	private StringHolder OUT_RETMSG = new StringHolder();
	private StringHolder OUT_BATCH_ID = new StringHolder();
	
	
	/**
	 * 接口输入字段
	 */
	private String IN_MASTER_TYPE ="";
	private String IN_TABLE_NAME ="";
	private String IN_STARTDATE ="";
	private String IN_ENDDATE ="";
	private String IN_PAGE ="";
	private String IN_BATCH_ID = "";
	private String IN_SYS_NAME ="";
	public String getTargetURL() {
		return targetURL;
	}
	public void setTargetURL(String targetURL) {
		this.targetURL = targetURL;
	}
	public StringHolder getOUT_PAGE() {
		return OUT_PAGE;
	}
	public void setOUT_PAGE(StringHolder oUT_PAGE) {
		OUT_PAGE = oUT_PAGE;
	}
	public StringHolder getOUT_RESULT() {
		return OUT_RESULT;
	}
	public void setOUT_RESULT(StringHolder oUT_RESULT) {
		OUT_RESULT = oUT_RESULT;
	}
	public StringHolder getOUT_RETCODE() {
		return OUT_RETCODE;
	}
	public void setOUT_RETCODE(StringHolder oUT_RETCODE) {
		OUT_RETCODE = oUT_RETCODE;
	}
	public IntHolder getOUT_ALL_NUM() {
		return OUT_ALL_NUM;
	}
	public void setOUT_ALL_NUM(IntHolder oUT_ALL_NUM) {
		OUT_ALL_NUM = oUT_ALL_NUM;
	}
	public IntHolder getOUT_PAGE_CON() {
		return OUT_PAGE_CON;
	}
	public void setOUT_PAGE_CON(IntHolder oUT_PAGE_CON) {
		OUT_PAGE_CON = oUT_PAGE_CON;
	}
	public StringHolder getOUT_ALL_COUNT() {
		return OUT_ALL_COUNT;
	}
	public void setOUT_ALL_COUNT(StringHolder oUT_ALL_COUNT) {
		OUT_ALL_COUNT = oUT_ALL_COUNT;
	}
	public StringHolder getOUT_RETMSG() {
		return OUT_RETMSG;
	}
	public void setOUT_RETMSG(StringHolder oUT_RETMSG) {
		OUT_RETMSG = oUT_RETMSG;
	}
	public StringHolder getOUT_BATCH_ID() {
		return OUT_BATCH_ID;
	}
	public void setOUT_BATCH_ID(StringHolder oUT_BATCH_ID) {
		OUT_BATCH_ID = oUT_BATCH_ID;
	}
	public String getIN_SYS_NAME() {
		return IN_SYS_NAME;
	}
	public void setIN_SYS_NAME(String iN_SYS_NAME) {
		IN_SYS_NAME = iN_SYS_NAME;
	}
	public String getIN_MASTER_TYPE() {
		return IN_MASTER_TYPE;
	}
	public void setIN_MASTER_TYPE(String iN_MASTER_TYPE) {
		IN_MASTER_TYPE = iN_MASTER_TYPE;
	}
	public String getIN_TABLE_NAME() {
		return IN_TABLE_NAME;
	}
	public void setIN_TABLE_NAME(String iN_TABLE_NAME) {
		IN_TABLE_NAME = iN_TABLE_NAME;
	}
	public String getIN_STARTDATE() {
		return IN_STARTDATE;
	}
	public void setIN_STARTDATE(String iN_STARTDATE) {
		IN_STARTDATE = iN_STARTDATE;
	}
	public String getIN_ENDDATE() {
		return IN_ENDDATE;
	}
	public void setIN_ENDDATE(String iN_ENDDATE) {
		IN_ENDDATE = iN_ENDDATE;
	}
	public String getIN_PAGE() {
		return IN_PAGE;
	}
	public void setIN_PAGE(String iN_PAGE) {
		IN_PAGE = iN_PAGE;
	}
	public String getIN_BATCH_ID() {
		return IN_BATCH_ID;
	}
	public void setIN_BATCH_ID(String iN_BATCH_ID) {
		IN_BATCH_ID = iN_BATCH_ID;
	}
	
}
