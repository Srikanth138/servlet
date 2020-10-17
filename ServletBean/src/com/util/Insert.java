package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Dao.InsertDao;
import com.bean.BeanClass;

public class Insert extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	int k;
	public BeanClass bb;
	public InsertDao id;
	public ServletContext sct;
	
	@Override
	public void init() throws ServletException{
		id=new InsertDao();
		sct=this.getServletContext();
		bb=(BeanClass)sct.getAttribute("beanRef");
		}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		k=id.insert(bb);
		if(k!=0){
			pw.println("DETAILS ARE INSERTED SUCCESFULLY.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
		else{
			pw.println("DETAILS INSERTION FAILE.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}

}
