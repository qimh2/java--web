<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  		<s:debug></s:debug>
  
    	名字：${username }<br>
    	名字2：<%= request.getAttribute("username") %><br>
    	密码：${pwd }<br>
    	requst类：<%=request
    	
    	 %>
    	<br>---------------------ONGL表单时和s:property 获取属性-----------------------<br>
    	
    	名字：<s:property value = "[0].username"/>
    	密码：<s:property value = "pwd"/>
    	年龄：<s:property value = "age"/>
    	<br>---------------------ONGL表单时和s:property 获取属性-----------------------<br>
    	
    	名字：<s:property value = "[1].username"/>
    	密码：<s:property value = "[1].pwd"/>
    	年龄：<s:property value = "[1].age"/>
    	
  </body>
</html>
