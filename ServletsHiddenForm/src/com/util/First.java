package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/now")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String fname=req.getParameter("name");
		String no=req.getParameter("no");
		
		pw.println("name:"+fname);
		pw.println("<br>no:"+no);
		
		pw.println("<form mathod='get' action='second' ");
		pw.println("<input type='hidden' name='name' value='"+fname+"'>");
		pw.println("<input type='text' name='number' value='"+no+"'><br>");
		pw.println("<a href='second'>Click1</a>"); //not display hiiden values
		pw.println("<input type='submit' value='click2'");
		pw.println("</form>");
	}

}
