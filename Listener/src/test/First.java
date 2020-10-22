package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/first")
public class First extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String n=req.getParameter("uname");
		out.print("welcome"+n);
		
		HttpSession hs=req.getSession();
		hs.setAttribute("uname", n);
		
		ServletContext ctx=this.getServletContext();
		int t=(Integer)ctx.getAttribute("totalusers");
		int c=(Integer)ctx.getAttribute("currentusers");
		
		out.print("<br>total users="+t);
		out.print("<br>current users="+c);
		out.print("<br><a href='logout'>logout</a>");
		out.close();
	}
}
