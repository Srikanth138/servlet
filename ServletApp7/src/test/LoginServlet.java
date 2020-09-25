package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=this.getServletContext();
		boolean z=new LoginDAo().login(req, sct);
		if(z){
			String fName=(String)sct.getAttribute("fName");
			pw.println("welcome user : "+fName+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Link.html");
			rd.include(req, res);
			}
		else{
			pw.println("Invalid UserName or PassWord....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
	}

}
