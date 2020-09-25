package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class InsertServlet extends GenericServlet{
	public InsertDAO id;
	
	@Override
	public void init()throws ServletException{
	id=new InsertDAO();	
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=id.insert(req); //method is called here -> insert(ServletRequest req)
		if(k>0){
			pw.println("Book Details Inserted successfully....");
		}
	}
}