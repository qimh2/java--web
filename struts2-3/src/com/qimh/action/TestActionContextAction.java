package com.qimh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {

	
	public String execute(){
		
		
		System.out.println("--------------in------------");
		
		//获取ActionContext
		
		ActionContext actionContext = ActionContext.getContext();
		
		
		
		//获取applicationMap
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		
		System.out.println("application 的值"+applicationMap.get("date"));
		
		//获取session
		Map<String, Object> sessionMap = actionContext.getSession();
		
		//获取request 对象
		//ActionContext 中，并没有提供getRequest() 方法来获取request对应的Map
		//需要手工调用get方法，传入request字符串来获取
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		System.out.println("request 值："+requestMap.get("req"));
		
		
		//获取请求参数对应的Map ，并获取指定的值
		//键：请求参数的名字，值：请求参数的值对应一个字符串数组
		//注意： 1.getParametes 的返回值是Map<String,Object> 而不是Map<String,String[]>
		//     2. parametersMap 只能读，不能写入数据，如果写入但出错，但也不去作用
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println("name:"+((String[])parametersMap.get("name"))[0]);
		parametersMap.put("age", 100);
		
		return "success";
		
	}
}
