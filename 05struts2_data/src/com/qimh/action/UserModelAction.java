package com.qimh.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.qimh.entity.User;

//ģ������
public class UserModelAction implements ModelDriven<User>{

	private User user = new User();
	
	
	public String register(){
		return Action.SUCCESS;
	}
	
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println("�����ݣ�"+user);
		return user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
