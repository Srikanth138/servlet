package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DisServlet extends GenericServlet {
	public ServletContext sct;
	public ServletConfig sc;
	@Override
	public void init()throws ServletException{
		sct=this.getServletContext();
		sc=this.getServletConfig();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String uName=req.getParameter("uname"); //uname take html
	int a=Integer.parseInt(sct.getInitParameter("a")); //take xml
	int b=Integer.parseInt(sc.getInitParameter("b")); //take xml
	pw.println("Welcome user:"+uName+"<br>");
	pw.println("===Servlet Context===<br>");
	pw.println("Server Name:"+sct.getServerInfo()+"<br>");
	pw.println("The Context value:"+a+"<br>");
	pw.println("===Servlet Config=== <br>");
	pw.println("ServletName:"+sc.getServletName()+"<br>");
	pw.println("Config value:"+b);
	}

}
