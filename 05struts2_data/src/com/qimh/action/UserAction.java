package com.qimh.action;

import com.opensymphony.xwork2.Action;
import com.qimh.entity.User;

//属性驱动
public class UserAction {
	private User user;
	
	
	//注册
	public String register(){
		System.out.println("user对象:"+user);
		return Action.SUCCESS;
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
