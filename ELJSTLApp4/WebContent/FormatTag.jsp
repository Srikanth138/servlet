<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Different Formats of the Date</h2>
<c:set var="Date" value="<%= new java.util.Date() %>" />
<p>
Formatted Time:
<fmt:formatDate type="time" value="${Date }"/>
</p>
<p>
Formated Date:
<fmt:formatDate value="${Date }" type="date"/>
</p>
<p>
Formated Date and Time:
<fmt:formatDate type="both" value="${Date }" />
</p>
<p>
Formatted Date and Time short style:
<fmt:formatDate value="${Date }" type="both" dateStyle="short" timeStyle="short" />
</p>

<p>
Formatted Date and Time medium style:
<fmt:formatDate value="${Date }" type="both" dateStyle="medium" timeStyle="medium" />
</p>
<p>
Formatted Date and Time long style:
<fmt:formatDate value="${Date }" type="both" dateStyle="long" timeStyle="long" />
</p>

</body>
</html>