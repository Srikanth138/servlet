<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    errorPage="Error.jsp"
    %>
    
    <%= new Date() %>
    
    <%! int fact;
    int factorial(int n)
    {
    fact=1;
    for(int i=n;i>=1;i--){
    fact=fact*i;
    }
    return fact;
    }
    %>
    
    <% 
    int val=Integer.parseInt(request.getParameter("val"));
    out.println("Factorial="+factorial(val));
    out.println("<br>Context val:"+application.getInitParameter("a"));
    out.println("<br>ServletInfo:"+application.getServerInfo());
    out.println("<br>Config val:"+config.getInitParameter("b"));
    out.println("<br>JSPName:"+config.getServletName());
    %>
   
    <%@ include file="input.html" %> 
    