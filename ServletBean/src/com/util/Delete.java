package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Dao.DeleteDao;
import com.bean.BeanClass;

public class Delete extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	 int d;
	public BeanClass bb;
	public DeleteDao dd;
	public ServletContext sct;
	
	@Override
	public void init() throws ServletException {
		dd=new DeleteDao();
		sct=this.getServletContext();
		bb=(BeanClass)sct.getAttribute("dltRef");
	}

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		d=dd.delete(bb);
		if(d!=0){
			pw.println("DETAILS ARE DELETED SUCCESFULLY.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
		else{
			pw.println("DETAILS DELETION FAILE.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}

}
