<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
 <c:when test="${param.submit eq 'Add'}">
  Sum of <c:out value="${param.op1 }"/>
  and
  <c:out value="${param.op2}"/> is
  <c:out value="${param.op1+param.op2}"/>
  </c:when>
  
  <c:otherwise>
   First: <c:out value="${param.op1}"/>and
    <c:out value="${param.op2}"/>is
   <c:out value="${param.op1 -param.op2}"/>
  </c:otherwise>
</c:choose>

<jsp:include page="input.html"/>
</body>
</html>