package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		HttpSession hs=req.getSession(false);
		hs.invalidate();
		pw.print("you are successfully logged out");
		pw.close();
	}

}
