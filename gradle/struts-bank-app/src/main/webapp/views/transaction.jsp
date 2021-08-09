<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
</head>
<body>
	<div class= "jumbotron text-center">
		<h1>Bank-App</h1>
	</div>
		<s:form action = 'doTransaction' onsubmit = 'return validate();'>
		    <s:textfield name = 'transaction.amount' label = 'amount'/>
		    <s:radio list="{'D','W'}" values="{'D','W'}" name="transaction.type" multiple = 'false'></s:radio>
		  	<s:submit />
		</s:form>
		<s:property value = 'error'/>
</body>
</html>