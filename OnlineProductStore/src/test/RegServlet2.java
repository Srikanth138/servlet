package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet2 extends GenericServlet{
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
		}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ub.setAddr(req.getParameter("addr"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
		ub.setMid(req.getParameter("mid"));
		pw.println("your Registartion details are valid \t ");
		pw.println("<a href=view2>click</a> \t ");
		pw.println("to view the details.....");
	}

}
