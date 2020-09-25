package test;
import java.io.*;
import javax.servlet.*;
public class HomeServlet extends GenericServlet {
//@override
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	String s1=req.getParameter("s1");
	if(s1.equals("Add")){
		RequestDispatcher rd=req.getRequestDispatcher("Add");
		rd.forward(req, res);
	}else{
		RequestDispatcher rd=req.getRequestDispatcher("Sub");
		rd.forward(req, res);
	}
}
}
