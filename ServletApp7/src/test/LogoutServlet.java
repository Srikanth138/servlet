package test;
import java.io.*;
import javax.servlet.*;
public class LogoutServlet extends GenericServlet{
	public ServletContext sct;
	public void init()throws ServletException{
		sct=this.getServletContext();
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		sct.removeAttribute("fname");
		sct.removeAttribute("beanRef");
		pw.println("logged out Successfully...<br>");
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, res);
	}
}
