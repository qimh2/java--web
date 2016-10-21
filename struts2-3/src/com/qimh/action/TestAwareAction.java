package com.qimh.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware,SessionAware,RequestAware{
	
	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	public String execute(){
		
		//1. application ����һ������ֵ��applicationKey2 - applicatonValue2
		application.put("applicationKey2", "applicationValue2");
		
		//2. ��application �ж�ȡһ������date������ӡ
		System.out.println("date:"+application.get("date"));
		
		
		
		
		//3 . ����session����
		this.session.put("sessionName2", "sessionValue2");
		
		
		//4. ����request����
		this.request.put("requestKey2", "requestValue2");
		
		return "success";
	}
	
	
	

	public void setApplication(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.application = arg0;
	}




	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}




	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

}
