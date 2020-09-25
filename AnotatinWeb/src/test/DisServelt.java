package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/ds")
public class DisServelt extends HttpServlet {
	public int count;
	public int n;
	@Override
	public void init()throws ServletException{
		count=100;
		n=200;
		}
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		count++;
		n++;
		int val=Integer.parseInt(req.getParameter("val"));
		pw.println("The value:"+val+"<br>");
		pw.println("count:"+count+"<br>");
		pw.println("n:"+n+"<br>");
		req.getRequestDispatcher("input.html").include(req, res);
	}
	@Override
	public void destroy(){
		n=0;
	}
}
