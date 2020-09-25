<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" %>

<%
int v1=Integer.parseInt(request.getParameter("v1"));
int v2=Integer.parseInt(request.getParameter("v2"));
int c=v1-v2;
%>
<jsp:forward page="Result.jsp">
  <jsp:param value="<%= c %>" name="result"/>
  </jsp:forward>
