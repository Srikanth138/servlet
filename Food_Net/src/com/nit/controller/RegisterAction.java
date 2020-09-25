package com.nit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.beans.RegistrationBean;
import com.nit.dao.UserDAO;

@SuppressWarnings("serial")
public class RegisterAction extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
			{
		/*response.getWriter().print("hello...");*/
		
		UserDAO dao = new UserDAO();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RegistrationBean rb = new RegistrationBean();
	
		
		rb.setUserId(request.getParameter("userId"));
		rb.setUserName(request.getParameter("userName"));
		rb.setPassword(request.getParameter("password"));
		rb.setMobile(request.getParameter("mobile"));
		rb.setMail(request.getParameter("mail"));
		@SuppressWarnings("unused")
		int i=0;
		rb.setAddress(request.getParameter("address"));
		
		rb.setRole("CUSTOMER");
		
		
		System.out.println("address---"+rb.getAddress());
		String target = "rregister.jsp?status=Registration Failed  !!!!!";
		
		boolean flag1 = dao.checkLoginIDExisted(request.getParameter("userId"));
		if (flag1 == true) {
			target = "register.jsp?status=" + request.getParameter("userId")
					+ "  Already Registered";
		} else {

			boolean f1 = dao.insertUserInfo(rb);
	
			if (f1 == true) {
				
				target = "login.jsp?status="+request.getParameter("userId")+" Account created successfully";
				
			} else {
				target = "register.jsp?status=Registration Failed  !!!!!";
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);

		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		doGet(request, response);
		out.flush();
		out.close();
		
		
		
	}


	

}
