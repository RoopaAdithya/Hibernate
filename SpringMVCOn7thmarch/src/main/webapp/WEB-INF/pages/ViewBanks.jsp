<%@page import="com.roopa.Bank"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><td>Id</td><td>Name</td><td>Address</td></tr>

	<%
		ArrayList al = (ArrayList) request.getAttribute("message");

		Iterator<Bank> i = al.iterator();

		while (i.hasNext()) {
			
			Bank bb=i.next();
			
	%>
	
	<tr><td><%=bb.getBankId() %></td>
	<td><%=bb.getBankName() %></td>
	<td><%=bb.getAddress() %></td></tr>
	<%
	
		}
	%></table>
</body>
</html>