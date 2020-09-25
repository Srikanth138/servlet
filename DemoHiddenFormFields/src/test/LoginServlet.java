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
				pw.println("<form action='view' method='get'>");
				pw.println("<input type='hidden' name='name' value='"+fName+"'>");
				pw.println("<input type='submit' value='view'>");
				pw.println("</form>");
				pw.println("<a herf='logout'>Logout</a>");
			}
	}
}
