package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/sele")
public class ServletClass extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		int no=Integer.parseInt(req.getParameter("no"));
		
		res.sendRedirect("http://localhost:3036/ServletGetdirectory//SelectGet?name="+name+"&no="+no);
	}

}
