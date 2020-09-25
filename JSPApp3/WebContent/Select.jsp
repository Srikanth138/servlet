<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp" %>
<%
 String s1=request.getParameter("s1");
 if(s1.equals("Add")){
%>
  <jsp:forward page="Addition.jsp"/>
<%
  }else{
%>
  <jsp:forward page="Subtraction.jsp"/>
<%
  }
%>