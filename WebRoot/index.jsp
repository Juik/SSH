<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
	<form action="login" method="post">
	用户名<input name="username"/><br/>
	密码<input name="password"/><br/>
	<input value="确定" type="submit"/>
	<input value="取消" type="reset"/>
	</form>
  </body>
</html>
