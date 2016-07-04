<%-- ---------------------------------------------------------------------------
作者：朱军
说明：查询唐诗首页
时间：2016.5.29
----------------------------------------------------------------------------- --%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<link href="css/index.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div align="center"    >
		<p class="s_title">唐诗搜索</p>
	</div>
    <div>
    <br>
 	<div class="s_notify">&nbsp;&nbsp;注：请输入搜索条件，支持模糊检索 。</div>
    
    	
	<br><br><br><br><br>
	<form action="findByAuthorAction" method="post">
		<label>&nbsp;&nbsp;(1) 根据作者进行搜索，请输入作者姓名： </label>
		 <input type="text"	name="author" value="李白" /> <input type="submit" value="确定" />
	</form>
	<br>
	
	<form action="findByTitleAction" method="post">
		<label> &nbsp;&nbsp;(2) 根据诗词标题进行搜索，请输入诗词名称 ：</label> 
		<input type="text"		name="title" value="蜀道" /> <input type="submit" value="确定" />
	</form>
	<br>
	
	<form action="findByContentAction" method="post">
		<label> &nbsp;&nbsp;(3) 根据诗词名句进行搜索，请输入名句内容 ：</label>
		 <input type="text"	name="content" value="飞流直下三千" /> 
		 <input type="submit" value="确定" />
	</form>
	</div>

</body>
</html>
