package com.nit.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nit.beans.RegistrationBean;
import com.nit.dao.UserDAO;

@SuppressWarnings("serial")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDAO dao = new UserDAO();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		RegistrationBean rb = new RegistrationBean();
		
		session.setAttribute("userId", request.getParameter("userId"));
		String target = "login.jsp?status=Internal Proublem Please Try again!";
		try
		{
		rb.setUserId(request.getParameter("userId"));
		rb.setPassword(request.getParameter("password"));
		RegistrationBean rb1 = new RegistrationBean();
		rb1 = dao.loginCheck(rb);
		
		
		String utype = rb1.getRole();
		String username = rb1.getUserName();
		
		System.out.println("utype===="+utype);
		
		
		
		if (utype.equals("ADMIN")) {
				/*target = "adminhome.jsp";*/
				target = "custmerfooditems.jsp";
				session.setAttribute("user", username);
				session.setAttribute("role", utype);
			
		
		} 
	else if (utype.equals("CUSTOMER")) {
		target = "custmerfooditems.jsp";
				/*target = "BoyHome.jsp";*/
				session.setAttribute("user", username);
				session.setAttribute("role", utype);
		
				

		} else if(utype.equals("RESTAURANT"))
		{
			target = "custmerfooditems.jsp";
		/*	target = "CustomerHome.jsp";*/
			session.setAttribute("user", username);
			session.setAttribute("role", utype);
			
		}
		
		
		else 
		{
			target = "login.jsp?status=Invalid username or password";
		}
		
		}
		catch(Exception e)
		{
			target = "login.jsp?status=Invalid username or password";
		}

		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);

		out.flush();
		out.close();
		
	
	}
}
