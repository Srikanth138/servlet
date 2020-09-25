package com.nit.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.nit.beans.RestaurantBean;
import com.nit.dao.UserDAO;
import com.nit.util.Constants;

@SuppressWarnings({ "serial", "unused" })
public class UploadRestaurant extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	UserDAO dao=new UserDAO();
	RestaurantBean r=new RestaurantBean();
	
	
	DiskFileItemFactory factory = new DiskFileItemFactory();
	ServletFileUpload upload = new ServletFileUpload(factory);

	try {

		@SuppressWarnings("rawtypes")
		List fileItems = upload.parseRequest(req);
		FileItem name=(FileItem)fileItems.get(0);
		r.setRestaurantName(name.getString());
		
		FileItem phone=(FileItem)fileItems.get(1);
		r.setPhone(phone.getString());
		
		
		FileItem email=(FileItem)fileItems.get(2);
		r.setEmail(email.getString());
		
		FileItem location=(FileItem)fileItems.get(3);
		r.setLocation(location.getString());
		FileItem hours=(FileItem)fileItems.get(4);
		r.setHours(hours.getString());
		FileItem food=(FileItem)fileItems.get(5);
		r.setFood(food.getString());
		
		FileItem price=(FileItem)fileItems.get(6);
		r.setPrice(price.getString());
		
		
		
		FileItem image=(FileItem)fileItems.get(7);
		
		byte[] bytes = image.get();

		File f = new File(  image.getName() + ".jpg");

		FileOutputStream fos = new FileOutputStream(f);
		fos.write(bytes);
		fos.close();
		r.setImage(f.toString());
		if(dao.uploadRestaurant(r)>0)
		{
			resp.sendRedirect("uploadRestaurant.jsp?status=Successfully Uploaded");
		}
		else
		{
			resp.sendRedirect("uploadRestaurant.jsp?status=Something went wrong");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
}
}
