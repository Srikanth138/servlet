package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class FirstServlet extends GenericServlet {
	
public void init()throws ServletException{
	
}
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String userName=req.getParameter("uname");
	pw.println("welcome to servlet program.....");
	pw.println("<br> Welcome user :"+userName);
	
}
public void destroy() {
	//NP CODE
}
}
