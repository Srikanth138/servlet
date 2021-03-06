package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		HttpSession hs=req.getSession(false);
		hs.removeAttribute("name");
		hs.invalidate();
		pw.println("user LoggedOut Successfully....<br>");
		req.getRequestDispatcher("Login.html").include(req,res);
	}
}
