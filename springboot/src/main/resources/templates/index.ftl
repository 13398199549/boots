<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>

	<fieldset>
		<legend>登录功能</legend>
		
		<form action="${req.contextPath}/sysmag/login" method="post">
		
			登录名：<input type="text" name="loginName"/>
			<br/>
			密码：<input type="text" name="password"/>
			<br/>
			<input type="submit" value="提交"/>
		</form>
	
	</fieldset>





</body>
</html>