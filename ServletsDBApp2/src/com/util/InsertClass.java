package com.util;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.DAO.InsertDAO;

@SuppressWarnings("serial")
@WebServlet("/InsertClass")
public class InsertClass extends GenericServlet implements Servlet {
    int i; // globel declaration default =0
	InsertDAO id;
	public void init(ServletConfig config) throws ServletException {
		id=new InsertDAO();
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try {	
				id.insert(req, res);

			}
		 catch (SQLException e) {
			e.printStackTrace();
		}
	}
}