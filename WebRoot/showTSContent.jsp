<%-- -----------------------------------------------------------------------
作者：朱军
说明：显示唐诗明细页面
时间：2016.5.29
-------------------------------------------------------------------------- --%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/ts_content.css">
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
</head>

<body>
	<BR />
	<BR />
	<BR />
	<div align="center" class="adiv">
		<table class="stable">
			<tr>
				<td class="tstitle"><%=request.getAttribute("title")%></td>
			</tr>
			<tr>
				<td class="tsauthor">&nbsp;&nbsp;<%=request.getAttribute("author")%>
				</td>
			</tr>

			<tr>
				<td class="tscontent"><BR>
				<BR> <%=request.getAttribute("content")%> <BR>
				<BR>
				<BR></td>
			</tr>
		</table>
		<BR> <a href="index.jsp">返回主页</a> &nbsp;&nbsp;&nbsp;&nbsp; 
	</div>
</body>
</html>
