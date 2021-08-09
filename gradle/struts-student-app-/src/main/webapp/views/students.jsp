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
<h1>Students</h1>
<table>
<tr>
  <th>Roll No</th>
  <th>Name</th>
  <th>Cgpa</th>
</tr>

<s:iterator value="students">
		<tr>
        <td><s:property value="rollNo" /></td>
        <td><s:property value="name" /></td>
        <td><s:property value="cgpa" /></td>
    	</tr>
</s:iterator>

</table>
</body>
</html>