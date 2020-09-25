package test;
import java.io.*;
import javax.servlet.*;
public class ViewProfileServlet extends GenericServlet{
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("=====user details=====<br>");
		pw.println("FirstName:"+ub.getfName()+"<br>");
		pw.println("lastName :"+ub.getlName()+"<br>");
		pw.println("Address  :"+ub.getAddr()+"<br>");
		pw.println("phoneNo  :"+ub.getPhno()+"<br>");
		pw.println("MailId   :"+ub.getMid()+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Link.html");
		rd.include(req, res);
	}

}


