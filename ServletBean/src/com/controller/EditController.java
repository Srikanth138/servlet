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


@SuppressWarnings("serial")
@WebServlet("/EditController")
public class EditController extends GenericServlet {

	BeanClass bb;
	ServletContext sct;
	public void init() throws ServletException {
	sct=this.getServletContext();
	bb=new BeanClass();
	sct.setAttribute("editRef",bb);
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String bcode=req.getParameter("bcode");	
		
		bb.setbCode(bcode);
		bb.setbName(req.getParameter("bname"));
		bb.setbAuthor(req.getParameter("author"));
		bb.setbPrice(Float.parseFloat(req.getParameter("price")));
		bb.setbQty(Integer.parseInt(req.getParameter("qty")));
		
		RequestDispatcher rd=req.getRequestDispatcher("edit"); //send the Bean Attribute one class to another class only forward request/include request to forward 
		rd.forward(req, res); 
	}

}
