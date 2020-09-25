package com.nit.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.dao.UserDAO;

@SuppressWarnings("serial")
public class UploadRoot extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		UserDAO dao=new UserDAO();
	StringBuilder sb=new StringBuilder();
	for(int i=1;i<=Integer.parseInt(req.getParameter("p"));i++)
	{
		sb.append(req.getParameter("point_"+i));
		sb.append(",");
	}
	if(dao.addRoute(req.getParameter("starting"),req.getParameter("ending"),sb.toString())>0)
	{
		resp.sendRedirect("uploadroots.jsp?status=Successfully Uploaded");
	}
	else
	{
		resp.sendRedirect("uploadroots.jsp?status=Something went wrong");
	}
	
	
	
	}

}
