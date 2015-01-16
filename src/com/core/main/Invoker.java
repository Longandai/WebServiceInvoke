package com.core.main;

import java.net.URL;
import com.core.general.involke.GeneralMDMDataRelease;
import com.core.general.involke.Generalmdmdatarelease_client_ep;
import com.core.general.involke.Generalmdmdatarelease_client_epLocator;
public class Invoker {
	public Invoker(){
		
	}
	public Invoker( InvokeContext context){
		this.context = context;
	}
	private  InvokeContext context;
	
	public InvokeContext getContext() {
		return context;
	}

	public void setContext(InvokeContext context) {
		this.context = context;
	}
	public InvokeContext invoke() throws Exception{
		Generalmdmdatarelease_client_ep client_ep = new Generalmdmdatarelease_client_epLocator();
		GeneralMDMDataRelease md =null;
		md = client_ep.getGeneralMDMDataRelease_pt(new URL(this.getContext().getTargetURL()));
		md.process(this.context.getIN_SYS_NAME(),
								 this.context.getIN_MASTER_TYPE(),
								 this.context.getIN_TABLE_NAME(), 
								 this.context.getIN_STARTDATE(), 
								 this.context.getIN_ENDDATE(), 
								 this.context.getIN_PAGE(), 
								 this.context.getIN_BATCH_ID(),
								 this.context.getOUT_PAGE(),
								 this.context.getOUT_RESULT(), 
								 this.context.getOUT_RETCODE(), 
								 this.context.getOUT_ALL_NUM(), 
								 this.context.getOUT_PAGE_CON(), 
								 this.context.getOUT_ALL_COUNT(), 
								 this.context.getOUT_RETMSG(), 
								 this.context.getOUT_BATCH_ID());
		return this.context;
	}
}
