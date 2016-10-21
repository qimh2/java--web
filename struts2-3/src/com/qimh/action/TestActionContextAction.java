package com.qimh.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {

	
	public String execute(){
		
		
		System.out.println("--------------in------------");
		
		//��ȡActionContext
		
		ActionContext actionContext = ActionContext.getContext();
		
		
		
		//��ȡapplicationMap
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("applicationKey", "applicationValue");
		
		System.out.println("application ��ֵ"+applicationMap.get("date"));
		
		//��ȡsession
		Map<String, Object> sessionMap = actionContext.getSession();
		
		//��ȡrequest ����
		//ActionContext �У���û���ṩgetRequest() ��������ȡrequest��Ӧ��Map
		//��Ҫ�ֹ�����get����������request�ַ�������ȡ
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		System.out.println("request ֵ��"+requestMap.get("req"));
		
		
		//��ȡ���������Ӧ��Map ������ȡָ����ֵ
		//����������������֣�ֵ�����������ֵ��Ӧһ���ַ�������
		//ע�⣺ 1.getParametes �ķ���ֵ��Map<String,Object> ������Map<String,String[]>
		//     2. parametersMap ֻ�ܶ�������д�����ݣ����д�뵫������Ҳ��ȥ����
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println("name:"+((String[])parametersMap.get("name"))[0]);
		parametersMap.put("age", 100);
		
		return "success";
		
	}
}
