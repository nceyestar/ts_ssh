<%-- ---------------------------------------------------------------------------
作者：朱军
说明：查询不到结果页面
时间：2016.5.29
----------------------------------------------------------------------------- --%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'noSet.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<br>
	<br>
	<div align="center">
		<H1>没有查询到任何信息!</H1>
	</div>
	<br>
	<br>
	<div align="center">
		<a href="index.jsp">点击返回主页面！</a>
	</div>
</body>
</html>
