package com.qimh.action;

public class LoginAction {
	
	private String username ;
	private String pwd ;
	
	public String login(){
		
		System.out.println("login.....");
		
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

	
	
	
	
}
