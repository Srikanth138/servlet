package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.DAO.SelectDAo;

@SuppressWarnings("serial")
@WebServlet("/Select")
public class Select extends GenericServlet implements Servlet {
	SelectDAo sd;  
	//boolean z;int i;
    public void init(ServletConfig config) throws ServletException {
	sd=new SelectDAo();
	} //init
    
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(sd!=null){
		sd.select(res);
		}
		else{
		pw.print("wrong ....");	
		}
	}
	public void destroy() {
			
	}

}

