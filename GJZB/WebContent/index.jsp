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
<link rel="stylesheet" href="css/user.css" />
<!--//引入EasyUI中文提示信息-->
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<!-- <script type="text/javascript" src="js/user.js"></script> -->
<title>国际招标系统</title>
</head>
<body>
<body class="easyui-layout">
	<div
		data-options="region:'north',title:'header',split:true,noheader:true"
		style="height: 60px; background: #666;">
		<jsp:include page="header.jsp"/>
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
	
	
	<script type="text/javascript">
		$(function() {
			$('#tabs').tabs({
				fit : true,
				border : false,
			});
			//导航条
			$('#nav').tree({
				url : 'nav',
				lines : true,
				animate:true,
				onLoadSuccess : function(node, data) {
					var _this = this;
					if (data) {
						$(data).each(function(index, value) {
							if (this.state == 'closed') {
								$(_this).tree('expandAll');
							}
						});
					}
				},
				onClick : function(node) {
					if (node.url) {  // url分别为：manager、user
						if ($('#tabs').tabs('exists', node.text)) {
							$('#tabs').tabs('select', node.text)
						} else {
							$('#tabs').tabs('add', {
								title : node.text,
								closable : true,
								iconCls : node.iconCls,
								href : node.url+'.jsp',
							});
						}
					}
				}
			});

		});
	</script>
	
</body>
</html>