<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register</h1>
	<s:form action = 'doAdd'>
		<s:textfield name = 'student.rollNo' label = 'rollNo'/>
		<s:textfield name = 'student.name' label = 'name'/>
		<s:textfield name = 'student.cgpa' label = 'cgpa'/>
		<s:submit />
	</s:form>
	<p><s:property value= "error" /></p>
</body>
</html>