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

@SuppressWarnings({ "serial", "unused" })
public class UploadTaxiDriver extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserDAO dao=new UserDAO();
		TaxiDriverBean t=new TaxiDriverBean();
		t.setName(req.getParameter("name"));
		t.setCurrentLocation(req.getParameter("location"));
		t.setEmail(req.getParameter("email"));
		t.setPhone(req.getParameter("phone"));
		String pickup=req.getParameter("pickUp");
		String dropTime=req.getParameter("dropTime");
		
		String pickups[]=pickup.split(":");
		String drops[]=dropTime.split(":");
		
		int hours=Integer.parseInt(pickups[0]);
		int mins=Integer.parseInt(pickups[1]);
		
		int dhours=Integer.parseInt(drops[0]);
		int dmins=Integer.parseInt(drops[1]);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String d=sdf.format(new Date());
		
		
		java.sql.Timestamp time = java.sql.Timestamp.valueOf(d+" "+hours+":"+mins+":10.0");
		java.sql.Timestamp time1 = java.sql.Timestamp.valueOf(d+" "+dhours+":"+dmins+":10.0");
		
		
		
		t.setPickUpTime(time);
		t.setDropTime(time1);
		
		if(dao.saveTaxiDriver(t)>0)
		{
			resp.sendRedirect("uploadTaxiDriver.jsp?status=Successfully Uploaded");
		}
		else
		{
			resp.sendRedirect("uploadTaxiDriver.jsp?status=Something went wrong");
		}
	}
}
