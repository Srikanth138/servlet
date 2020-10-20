package com.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FirstDAO;

@WebServlet("/FirstLogic")
public class FirstLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	FirstDAO fd;
	String name;
	public void init() throws ServletException {
		fd=new FirstDAO();
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		try {
			 name=fd.select(req,res);//calling the method in FirstDAO class
			 
			 Cookie ck=new Cookie("fname", name); //create the cookie
			 res.addCookie(ck); //cookie adding name
			 
			 if(name==null){
				 pw.println("please enter valid user name and password");
					RequestDispatcher rd=req.getRequestDispatcher("first.html");
					rd.include(req, res);
				}
			else{
					pw.println("First Name :"+name);
					RequestDispatcher rd=req.getRequestDispatcher("SecondLogic");
					rd.include(req,res);
				}
			 
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
