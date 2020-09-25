package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet extends GenericServlet {
	public ServletContext sct;
	public UserBean ub;
	public RegisterDAO rd;
	public void init() throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
		rd=new RegisterDAO();
		}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=rd.register(ub);
		if(k>0){
			pw.println("user Register successfully.....<br>");
			RequestDispatcher rds=req.getRequestDispatcher("login.html");
			rds.include(req, res);
		}
	}

}
