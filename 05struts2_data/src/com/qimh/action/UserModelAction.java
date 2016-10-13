package com.qimh.action;

import com.opensymphony.xwork2.ModelDriven;
import com.qimh.entity.User;

public class UserModelAction implements ModelDriven<User>{

	private User user = new User();
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
