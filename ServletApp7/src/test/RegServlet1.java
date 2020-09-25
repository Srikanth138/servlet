package test;
import java.io.*;
import javax.servlet.*;
public class RegServlet1 extends GenericServlet{
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException {
		sct=this.getServletContext();
		ub=new UserBean();
				sct.setAttribute("beanRef",ub);
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));//change here
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		RequestDispatcher rd=req.getRequestDispatcher("Reg2.html");
		rd.forward(req, res);
	}

}
