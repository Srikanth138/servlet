package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{
	ServletContext sct;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		Cookie c[]=req.getCookies();
		
		
		/*req.getServletContext(); //own
		req.removeAttribute("jcfRef");
		
		sct=this.getServletContext();
		sct=getServletContext(); */
		
//		sct=req.getServletContext();
//		sct.removeAttribute("jcfRef");
		
		
		if(c==null){
			pw.println("server information:"+sct.getServerInfo()+"</br>");
			pw.println("ServletContextName : "+sct.getInitParameterNames()+"</br>");
			pw.println("ServletContext : "+sct.getInitParameter("a")+"</br>");
			pw.println("please ! Login first...<br>");
			req.getRequestDispatcher("ULogin.html").include(req, res); 
		}
		else {
			req.getServletContext().removeAttribute("jcfRef");
			c[0].setMaxAge(0); //remove
			pw.println("Logged out Success fully...<br>");
			req.getRequestDispatcher("ULogin.html").include(req, res); 
		}
	}
}
