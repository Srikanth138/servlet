package com.nit.controller;


import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.beans.TaxiDriverBean;
import com.nit.dao.UserDAO;

@SuppressWarnings({ "unused", "serial" })
public class UploadOwnTaxi extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserDAO dao=new UserDAO();
		TaxiDriverBean t=new TaxiDriverBean();
		t.setName(req.getParameter("name"));
		t.setSource(req.getParameter("source"));
		t.setDestination(req.getParameter("destination"));
		
		t.setEmail(req.getParameter("email"));
		t.setPhone(req.getParameter("phone"));
		
		
		int i=dao.saveOwnTaxiDriver(t);
		if(i>0)
		{
			resp.sendRedirect("uploadTaxiDriver.jsp?status="+i+" orders Successfully Assigned");
		}
		else
		{
			resp.sendRedirect("uploadTaxiDriver.jsp?status=Something went wrong");
		}
	}
}
