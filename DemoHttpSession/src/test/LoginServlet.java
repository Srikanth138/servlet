package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=new LoginDAO().login(req);
		if(fName==null){
			pw.println("Invalid userName or Password...<br>");
			req.getRequestDispatcher("Login.html").include(req, res);
			}else{
				HttpSession hs=req.getSession();
				hs.setAttribute("name", fName);
				pw.println("<a href='view'>view</a>");
				pw.println("<a herf='logout'>Logout</a>");
			}
	}
}
