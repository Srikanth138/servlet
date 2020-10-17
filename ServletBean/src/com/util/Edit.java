package com.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.Dao.EdittDao;
import com.bean.BeanClass;

@WebServlet("/edit")
public class Edit extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	int e;
	public BeanClass bb;
	public EdittDao ee;
	public ServletContext sct;
	
	@Override
	public void init() throws ServletException{
		ee=new EdittDao();
		sct=this.getServletContext();
		bb=(BeanClass)sct.getAttribute("editRef");
		}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		try {
			e=ee.edit(bb);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(e!=0){
			pw.println("EDIT DETAILS ARE SUCCESFULLY.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
		else{
			pw.println("EDIT DETAILS FAILE.... ");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
		}
	}

}
