package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class EditProfileServlet extends GenericServlet{
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		//pw.println("<form action='update' method ='post'>");//line no 21
		pw.println("FirstName:<input type='text' name='fname' value='"+ub.getfName()+"'><br>");
		pw.println("lastName :<input type='text' name='lname' value='"+ub.getlName()+"'><br>");
		pw.println("Address  :<input type='text' name='addr' value='"+ub.getAddr()+"'><br>");
		pw.println("phoneNo  :<input type='text' name='phno' value='"+ub.getPhno()+"'><br>");
		pw.println("MailId  :<input type='text' name='mid' value='"+ub.getMid()+"'><br>");
		pw.println("<form action='update' method ='post'>");
		pw.println("<input type='submit' value='UpdateProfile'>");
		pw.println("</form>");
		
	}
}
