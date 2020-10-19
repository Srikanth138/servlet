package com.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookBean;

@WebServlet("/SecondDisplay")
public class SecondDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Cookie c[];
	BookBean bb,bbb;
    ServletContext sct;
	public void init(){
		sct=this.getServletContext();
		
	
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
				//Cookie c[]=request.getCookies();
				c=req.getCookies();
				String name=c[0].getValue();  //String name=c[1].getValue(); AIOBE -> cookie store small pice of amount.
				pw.println("<br>WellCome :"+name);
	
		bb=(BookBean)sct.getAttribute("beanSct"); //calling webApplication level 
		bbb=(BookBean)req.getAttribute("beanReq"); //calling request level
		pw.println("<br>ServletContext :"+bb.getbCode()+","+bb.getbName()+","+bb.getbAuthor()+","+bb.getbPrice()+","+bb.getbQty());
		pw.println("<br>ServletRequest :"+bbb.getbCode()+","+bbb.getbName()+","+bbb.getbAuthor()+","+bbb.getbPrice()+","+bbb.getbQty());
	
	}
	public void destroy() {
		c[0].setMaxAge(0); //destory the cookie
	}


}
