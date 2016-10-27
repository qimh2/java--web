package com.qimh.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction implements RequestAware,SessionAware,ApplicationAware{
	
	private String username ;
	private String pwd ;
	private int age;
	
	public String login(){
		
		System.out.println("login.....");
		
		//1. ��ȡֵջ
		//��ȡActionContext
		ActionContext actionContext = ActionContext.getContext();
		ValueStack valueStack = actionContext.getValueStack();
		
		//2. ����Test ���󣬲�Ϊ���Ը�ֵ
		Test test = new Test();
		test.setUsername("�ν�");
		test.setPwd("654321");
		
		
		//3.��Test ����ѹ�뵽ֵջ��ջ��
		valueStack.push(test);
		
		
		sessionMap.put("loginaction", this);
		requestMap.put("test", test);
		
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Map<String, Object> applicationMap;
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.applicationMap = application;
	}

	private Map<String, Object> sessionMap;
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.sessionMap = session;
	}

	private Map<String, Object> requestMap;
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.requestMap = request;
	}

	
	
	
	
	
	
}
