package test;
import java.io.*;
import javax.servlet.*;
//import javax.servlet.http.*;
public class DisFilter implements Filter{
	public FilterConfig fcg;
	public void init(FilterConfig fcg)throws ServletException{
		this.fcg=fcg;
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fch)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("uname");
		int a=Integer.parseInt(fcg.getInitParameter("a"));
		pw.println("===Disfrom Filter===<br>");
		pw.println("welcome:"+name+"<br>");
		pw.println("ServletName:"+fcg.getFilterName()+"<br>");
		pw.println("Config value:"+a);
	}

}
