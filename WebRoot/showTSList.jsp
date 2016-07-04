<%-- ------------------------------------------------------------------------------
作者：朱军
说明：显示查询结果的列表
时间：2016.5.29
-------------------------------------------------------------------------------- --%>
<%@page import="com.sun.crypto.provider.RSACipher"%>
<%@ page language="java" import="java.util.*,com.zj.model.*"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/ts_List.css" />
</head>

<body>
	<BR />
	<BR />
	<BR />
	<div align="center">
		<table class="table" id="ts">
			<tr>
				<th colspan="3" class="tableth">唐诗查询结果</th>
			</tr>
			<tr>
				<th colspan="3" class="tsnote">&nbsp;&nbsp;注：点击诗的标题，可查看唐诗的详细结果！</th>
			</tr>

			<tr>
				<td class="tstitle">标 题</td>
				<td class="tscontent">唐诗内容</td>
			</tr>
			<tr class="tsbody">
				<%
					List<Poetries> myR = (List) request.getAttribute("PoetList");
					Iterator myI = myR.iterator();
					while (myI.hasNext()) 
					{
						Poetries myTS = (Poetries) myI.next();
						String tmpContent=myTS.getContent();
						if(tmpContent.length()>20)
						   tmpContent=tmpContent.substring(0,20);
						
				%>
			 	<td class="tsbody"><a href="findByTitleAction?title=<%=myTS.getTitle()%>" >  <%=myTS.getTitle()%></a></td>
				<td class="tsbody"><%=tmpContent %>.....</td>
				
			</tr>
			<%
				}
			%>
		</table>
		<br> <a href="index.jsp" >返回主页</a>
	</div>
</body>
</html>
