package com.controller;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.bean.BeanClass;

@WebServlet("/DeleteController")
public class DeleteController extends GenericServlet {
	private static final long serialVersionUID = 1L;

	BeanClass bb;
	ServletContext sct;
	public void init() throws ServletException {
		sct=this.getServletContext();
		bb=new BeanClass();
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String bcode=request.getParameter("bcode");
		bb.setbCode(bcode);
		
		sct.setAttribute("dltRef", bb);
		RequestDispatcher rd=request.getRequestDispatcher("delete");
		rd.forward(request, response);
	}

}
