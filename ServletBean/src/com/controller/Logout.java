package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.bean.BeanClass;


@WebServlet("/Logout")
public class Logout extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	BeanClass bb;
	ServletContext sct;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		sct=this.getServletContext();
		
		//bb=(BeanClass)sct.getAttribute("dltRef");
		sct.removeAttribute("dltRef"); // void doesn't covert to class type
		sct.removeAttribute("editRef");
		sct.removeAttribute("beanRef");
		
		pw.println("LogedOut ......");
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, res);
	}

}
