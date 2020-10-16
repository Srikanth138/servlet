package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;

//@WebServlet("/first")
@SuppressWarnings("serial")
public class Basic extends GenericServlet{
	
	public void init(){
		
		
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException, ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/image");
		
		String name=req.getParameter("name");
		int a=Integer.parseInt(req.getParameter("a"));
		pw.println("WELCOME :"+name);
		pw.println(name+"\n"+a);
	}
	public void destroy(){
		
	}

}
