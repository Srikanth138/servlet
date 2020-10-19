package com.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;
import com.dao.BookDAO;

@WebServlet("/SecondLogic")
public class SecondLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	BookDAO bd;
	BookBean bb;
	ServletContext sct;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter pw=response.getWriter();
		response.setContentType("text/html"); */		
		sct=this.getServletContext();
		
		
		
		try {
			bd= new BookDAO();
			bb= new BookBean();
			
			bd.select(bb);
			sct.setAttribute("beanSct", bb); //webApplication level Attribute set
			request.setAttribute("beanReq", bb); //request level Attribute set
			
			RequestDispatcher rd=request.getRequestDispatcher("SecondDisplay");
			rd.forward(request, response);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
