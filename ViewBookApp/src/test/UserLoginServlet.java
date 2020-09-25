package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class UserLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=new LoginDAO().login(req);
		if(fName==null){
			pw.println("Invalid UserName or PassWord.....<br>");
			req.getRequestDispatcher("ULogin.html").include(req, res);
		}
		else{
			Cookie ck=new Cookie("name",fName);
			res.addCookie(ck);
			pw.println("WELCOME user : "+fName+"<br>");
			req.getRequestDispatcher("Link.html").include(req, res);
		}
	}
}
