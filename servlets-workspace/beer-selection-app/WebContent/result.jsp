<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Beer Recommendation By JSP</h1>
	<%
		List<String> brands = (List<String>) request.getAttribute("brands");
		Iterator it=brands.iterator();
		while(it.hasNext())
			out.print("<br>try : "+it.next());
	%>
</body>
</html>
