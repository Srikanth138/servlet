<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
String s1=request.getParameter("s1");
int c=Integer.parseInt(request.getParameter("result"));
if(s1.equals("Add")){
out.println("Addition="+c);
}else{
	out.println("Subtraction="+c);
}
%>
<jsp:include page="Option.html"></jsp:include>