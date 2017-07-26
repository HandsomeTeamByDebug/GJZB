<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="easyui/themes/black/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<!--//引入EasyUI中文提示信息-->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
.logo {
	width: 180px;
	height: 50px;
	line-height: 50px;
	text-align: center;
	font-size: 20px;
	font-weight: bold;
	float: left;
	color: #fff;
}

.logout {
	float: right;
	padding: 30px 15px 0 0;
	color: #fff;
}

a {
	color: #fff;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body class="easyui-layout">
	<div
		data-options="region:'north',title:'header',split:true,noheader:true"
		style="height: 60px; background: #666;">
		<div class="logo">后台管理</div>
		<div class="logout">
			 <a href="ht/exit">	登录</a> | <a href="ht/exit"> 注册</a>
		</div>
	</div>
	<div
		data-options="region:'south',title:'footer',split:true,noheader:true"
		style="height: 35px; line-height: 30px; text-align: center;"></div>
	<div
		data-options="region:'west',title:'导航',split:true,iconCls:'icon-world'"
		style="width: 180px; padding: 10px;">
		<ul id="nav"></ul>
	</div>
	<div data-options="region:'center'" style="overflow: hidden;">
		<div id="tabs">
			<div title=" 起始页" iconCls="icon-house"
				style="padding: 0 10px; display: block;">
				<p>欢迎来到后台管理系统！</p>
			</div>
		</div>
	</div>
	
</body>
</html>