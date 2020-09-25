package com.nit.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nit.beans.PassengerBean;
import com.nit.dao.UserDAO;

@SuppressWarnings("serial")
public class UploadPassenger extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserDAO dao=new UserDAO();
		PassengerBean t=new PassengerBean();
		t.setName(req.getParameter("name"));
		t.setSourceLocation(req.getParameter("source"));
		t.setDestinationLocation(req.getParameter("destination"));
		t.setPickUpTime(req.getParameter("pickup"));
		t.setTaxiId(Integer.parseInt(req.getParameter("taxiId")));
		
		if(dao.savePassenger(t)>0)
		{
			resp.sendRedirect("uploadPassenger.jsp?status=Successfully Uploaded");
		}
		else
		{
			resp.sendRedirect("uploadPassenger.jsp?status=Something went wrong");
		}
	}
}
