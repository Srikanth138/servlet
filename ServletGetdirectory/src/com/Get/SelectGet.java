package com.Get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectGet")
public class SelectGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
   		res.getWriter().append("Served at: ").append(req.getContextPath()); //Served at: /ServletGetdirectory
   		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		int no=Integer.parseInt(req.getParameter("no"));
		pw.println("<br/>Name ::"+name+"<br/>No ::"+no);
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
