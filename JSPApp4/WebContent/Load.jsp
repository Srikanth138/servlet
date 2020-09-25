<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="prod" class="test.Product" scope="session"/>

<jsp:setProperty property="pCode" param="pcode" name="prod"/>
<jsp:setProperty property="pName" param="pname" name="prod"/>
<jsp:setProperty property="pPrice" param="pprice" name="prod"/>
<jsp:setProperty property="pQty" param="pqty" name="prod"/>
<a href="Retrive.jsp">ViewProduct</a>
</body>
</html>