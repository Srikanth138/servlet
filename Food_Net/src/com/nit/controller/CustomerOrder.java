package com.nit.controller;


import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nit.beans.RestaurantBean;
import com.nit.dao.UserDAO;

@SuppressWarnings("serial")
public class CustomerOrder extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserDAO dao=new UserDAO();
		RestaurantBean rb=new RestaurantBean();
		rb.setId(Integer.parseInt(req.getParameter("id")));
		rb.setRestaurantName(req.getParameter("name"));
		rb.setLocation(req.getParameter("location"));
		rb.setFood(req.getParameter("food"));
		rb.setQuantity(Integer.parseInt(req.getParameter("quan")));
		rb.setPrice(req.getParameter("price"));
		rb.setUserLocation(req.getParameter("userLocation"));
		rb.setOrderTime(new Timestamp(new Date().getTime()));
		rb.setDeadLine(req.getParameter("deadLine"));
		rb.setStatus("PENDING");
		HttpSession hs=req.getSession(false);
		rb.setUserId((String)hs.getAttribute("userId"));
		
		if(dao.saveOrder(rb)>0)
		{
			resp.sendRedirect("custmerfooditems.jsp?status=Order request successfully sent");
		}
		else
		{
			resp.sendRedirect("custmerfooditems.jsp?status=Something went wrong");
		}
		
		
		
	
	
	}

}
