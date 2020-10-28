package com.nt;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Excel extends HttpServlet {
	

	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		res.setContentType("application/x-msdownload");
		res.setHeader("refresh","10");
		PrintWriter pw=res.getWriter();
		pw.print("<table bgcolor='cyan' border='2' align='center'>");
		pw.println("<tr><th>Name</th> <th>AGE</th> <th>AREA</th></tr>");
		pw.println("<tr><td>Srikanth</td> <td>24</td> <td>Hyd</td></tr>");
		pw.println("<tr><td>vish</td> <td>10</td> <td>Jgl</td></tr>");
		pw.println("<tr><td>raju</td> <td>20</td> <td>Jpr</td></tr>");
		pw.println("</table>");
		
		pw.println("<h1 style=color:red;align:center>Date is changeing"+new java.util.Date()+"</h1>");
		pw.close();
	}
 

}
