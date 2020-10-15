package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RetriveServlet extends GenericServlet{
	public RetrivalDAO rd;
	@Override
	public void init()throws ServletException{
		rd=new RetrivalDAO();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
//		boolean z=rd.retrive(req,res);
		boolean z=rd.retrive(req,pw);
		if(!z){
			pw.println("Invaild bookCode......<br>");
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
	}
}
