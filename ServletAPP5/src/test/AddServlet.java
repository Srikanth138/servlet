package test;
import java.io.*;
import javax.servlet.*;
//@SuppressWarning("serial")
public class AddServlet extends GenericServlet {
	//@override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try{
		int a=Integer.parseInt(req.getParameter("v1"));
		int b=Integer.parseInt(req.getParameter("v2"));
		int c=a+b;
		
		req.setAttribute("c", c);
		
		pw.println("Addition:"+c+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}
	catch(Exception e){
		pw.println("Invalid values ...Enter only Integer values....<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
	}
	}	
}
