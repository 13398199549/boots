<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<script type="text/javascript" src="${req.contextPath}/static/js/jquery-3.3.1.min.js?version=20190124"></script>
<script type="text/javascript" src="${req.contextPath}/static/js/view/main.view.js?version=20190124"></script>
<base href="${req.contextPath}/">

</head>
<body>
	<!-- Freemarker技术的内置对象：
	
	Request 用于获取Request对象中的attribute对象
	Session 用于获取Session对象中的attribute对象
	Application 用于获取Application(ServletContext)对象中的attribute对象
	RequestParameters 用于获取Request对象的parameter参数（浏览器端发送的请求数据）
	Parameters 属性获取，依次从RequestParameters、Request、Session、Application对象中获取对应属性参数，一旦获取，则不再向下查找
	
	-->  

	<!-- 如果需要获取通过setAttribute() 添加的属性，那么此处就应该用Request,或者干脆直接省略,
	其他的属性，我们就使用spring.freemarker.request-context-attribute=req 配置的req去获取-->
	这是首页！
	${user.userName}

	<button id="btn01">新增用户</button>
	<button id="btn02">修改用户</button>
	<button id="btn03">删除用户</button>
	<button id="btn04">查询用户</button>
	
<br/>

	<a href="${req.contextPath}/sysmag/freemarker?userName=PXB">跳转到Freemarker页面</a>

</body>
</html>