package com.qimh.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExtendsAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("extends action....");
		return ActionSupport.SUCCESS;
	}

}
