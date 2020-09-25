package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DispleyServlet extends GenericServlet{
	 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String pcode=req.getParameter("pcode");
		String pname=req.getParameter("pname");
		float price=Float.parseFloat(req.getParameter("pprice"));
		int pqty=Integer.parseInt(req.getParameter("pqty"));

		pw.println("product code:"+pcode+"<br>");
		pw.println("product code:"+pname+"<br>");
		pw.println("product code:"+price+"<br>");
		pw.println("product code:"+pqty);
	

}
}
