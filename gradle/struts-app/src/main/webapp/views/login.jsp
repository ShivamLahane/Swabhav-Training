<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Log In</h1>
	<s:form action = 'welcome'>
		<s:textfield name = 'name' label = 'name'/>
		<s:password name = 'pwd' label = 'password'/>
		<s:submit />
	</s:form>
</body>
</html>