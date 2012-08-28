<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<center>

<h2>Hello Worldssssddss!</h2>

	<s:form action="login" method="post" theme="simple" namespace="/">
				请输入验证码：<s:textfield name="code" size="4"/><img alt="sssssssssss" src="kaptcha.jpg"><br> 
				<s:submit value="提交" /> <s:reset value="重置" />
	</s:form>

</center>
</body>
</html>

