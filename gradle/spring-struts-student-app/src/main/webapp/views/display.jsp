<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Students</h1>
<table>
<tr>
  <th>ID</th>
  <th>Roll No</th>
  <th>Name</th>
  <th>Cgpa</th>
  <th>Location</th>
  
</tr>

<s:iterator value="students">
		<tr>
		<td><s:property value="id" /></td>
        <td><s:property value="rollNo" /></td>
        <td><s:property value="name" /></td>
        <td><s:property value="cgpa" /></td>
        <td><s:property value="location" /></td>
       	<td>
		<s:form action = 'edit'>
		<s:hidden name = 'id'  label = 'rollNo'/>
		<s:hidden name = 'rollNo' label = 'rollNo'/>
		<s:hidden name = 'name' label = 'name'/>
		<s:hidden name = 'cgpa' label = 'cgpa'/>
		<s:hidden name = 'location' label = 'location'/>
		<s:submit />
	</s:form>
		</td>
		<td>
				<a type='button'
					onclick="return confirm('Are you sure, you want to delete it?'); "
					href="delete?id=<s:property value="id"/>">
						<button class="button-delete">Delete</button>
				</a>
		</td>
    	</tr>
</s:iterator>

</table>
</body>
</html>