package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginFilter implements Filter {
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=new LoginDAO().login(req);
		if(fName==null){
			pw.println("please! Login First ....<br>");			
		}else{
			req.setAttribute("name", fName);
			fc.doFilter(req, res);
		}
	}

}
