package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DeleteServlet extends GenericServlet{
	public DeleteDAO dd=null;
	
	@Override
	public void init()throws ServletException{
	dd=new DeleteDAO();	
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=dd.delete(req); //method is called here -> insert(ServletRequest req)
		if(k>0){
			pw.println("BOOK DETAILS DELETED SUCCESSFULLY....");
		}
		else
			pw.println("THE BOOK CODE IS NOT FOUND...");
	}
}