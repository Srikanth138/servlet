package com.Dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


@SuppressWarnings("serial")
public class SelectDao extends GenericServlet {
	
	ServletConfig scf;
	ServletContext sct;
	public void service(ServletRequest req,ServletResponse res)throws ServletException, IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Request Parameter :"+req.getParameter("name")+"<br>"+req.getParameter("no")+"<br>");
		
		scf=this.getServletConfig();
		String name=scf.getInitParameter("name");
		
		scf.getServletContext();//ServletContext use
		
		sct=this.getServletContext();
		int cont=Integer.parseInt(sct.getInitParameter("cont"));
		//req.getServletContext();
		//String cont=req.getServletContext().getInitParameter("cont");
		
		pw.println("<h1>ServletConfig</h1>");
		pw.println("ServletConfig :"+name+"<br/>"); // <param-value>SelectD</param-value>
		pw.println("ServletName	:"+scf.getServletName()+"<br/>"); //<servlet-name>select</servlet-name> //program level
		
		pw.println("<h1>ServletContext</h1>");
		pw.println("ServletContext :"+cont+"<br/>"); //<param-value>1000</param-value>
		pw.println("ServletContextName :"+sct.getServletContextName()+"<br/>"); //ServletConf&Context //application level
		pw.println("ServletContextName1 :"+sct.getServerInfo()+"<br/>"); //Apache Tomcat/9.0.35
		pw.println("ServletContextName2 :"+req.getServletContext().getServerInfo()+"<br/>"); //Apache Tomcat/9.0.35
		
		pw.println("ContextPath :"+sct.getContextPath()+"<br/>"); //ServletConf_Context //class create time writen
		pw.println("ContextRealPath :"+sct.getRealPath(name)+"<br/>"); //path store drive D:\
		pw.println("ContextVirtualServerName :"+sct.getVirtualServerName()+"<br/>"); 
		pw.println("MimeType :"+sct.getMimeType(getServletInfo())+"<br/>"); 
		pw.println("EffectiveMajorVersion :"+sct.getEffectiveMajorVersion()+"<br/>"); 
		pw.println("MajorVersion :"+sct.getMajorVersion()+"<br/>"); 
		pw.println("MinorVersion :"+sct.getMinorVersion()+"<br/>");
		 

		
		
		
	}

}
