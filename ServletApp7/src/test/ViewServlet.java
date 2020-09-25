package test;
import java.io.*;
import javax.servlet.*;
public class ViewServlet extends GenericServlet {
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<form action='reg' method='post'>");// change line no 23
		pw.println("====user details===<br>");
		pw.println("userName :"+ub.getuName()+"<br>");
		pw.println("password :"+ub.getpWord()+"<br>");
		pw.println("firstname:"+ub.getfName()+"<br>");
		pw.println("lastname :"+ub.getlName()+"<br>");
		pw.println("address  :"+ub.getAddr()+"<br>");
		pw.println("phoneNo  :"+ub.getPhno()+"<br>");
		pw.println("mailId   :"+ub.getMid()+"<br>");
		//pw.println("<form action='reg' method='post'>");
		pw.println("<input type='submit' value='Register'>");
		pw.println("</form>");
		}

}
