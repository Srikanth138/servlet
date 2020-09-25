package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class UpdateProfileServlet extends GenericServlet{
	public ServletContext sct;
	public UserBean ub;
	public void init()throws ServletException{
		sct=this.getServletContext();
		ub=(UserBean)sct.getAttribute("beanRef");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ub.setfName(req.getParameter("fname")); //fname change
		ub.setlName(req.getParameter("lname"));
		ub.setAddr(req.getParameter("addr"));
        ub.setPhno(Long.parseLong(req.getParameter("phno")));
		ub.setMid(req.getParameter("mid"));
		int k=new UpdateDAO().update(ub);
		if(k>0){
			pw.println("Profile update successfully....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Link.html");
			rd.include(req, res);
		}
	}
}
