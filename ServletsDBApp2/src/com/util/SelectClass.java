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

import com.DAO.SelectDAO;

@SuppressWarnings("serial")
@WebServlet("/SelectClass")
public class SelectClass extends GenericServlet implements Servlet {
    int i; // globel declaration default =0
	SelectDAO sd;
	public void init(ServletConfig config) throws ServletException {
		sd=new SelectDAO();
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//i=sd.select(req, res);
		try {
				sd.select(req, res);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}