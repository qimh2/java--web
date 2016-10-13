package com.qimh.action;

import com.opensymphony.xwork2.Action;
import com.qimh.entity.User;

public class UserAction {
	private User user;
	
	
	//×¢²á
	public String register(){
		System.out.println("user¶ÔÏó:"+user);
		return Action.SUCCESS;
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
