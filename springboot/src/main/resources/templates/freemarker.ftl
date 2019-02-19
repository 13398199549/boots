<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>这是Freemarker介绍页面</title>
</head>
<body>
	
	
	
	<h1>这是Freemarker介绍页面</h1>
	
	
	<#-- 在freemarker 页面中，注释方式2种：HTML注释，Freemarker注释
	
	(HTML注释 ，只针对HTML代码有效，不能控制Ftl代码)
	 -->
	
	<#-- <#if userName?? > 判断是否具有userName这个属性存在？ -->
	
	<#if userName?? >
		${userName}
	<#else>
		${userName!"新人"}
	</#if>
	
	<br/>
	
	<#if userName =='PXB' >
		<font color="red">${userName},我们最尊敬的哥，你好！</font>
	<#else>	
		<font color="green">${userName}，滚去抓泥巴！</font>
	</#if>
	
	<br/>
	
	<#list users as u>
		${u.userName}
	</#list>
	
	
	${companyBean}

</body>
</html>