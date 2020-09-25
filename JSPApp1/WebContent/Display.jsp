<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uName=request.getParameter("uname");
String mId=request.getParameter("mid");
long phNo=Long.parseLong(request.getParameter("phno")); //request/response is predefine method in JSP.
out.println("UserName:"+uName);
out.println("<br>MailId:"+mId);
out.println("<br>phno:"+phNo); //out is predefine method in jsp
%>
</body>
</html>