package com.qimh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction {
	
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

	
	
	
	
	
	
}
