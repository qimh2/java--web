package com.qimh;

public class LoginAction {
	
	
	private String username ;
	private String pwd;
	
	
	//处理方法
	public String execute(){
		
//		Integer.parseInt("ssss");
		if("qimh".equals(username) && "123456".equals(pwd)){
			
			return "success";
		}else{
			
			return "failed";
		}
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
