package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class DeleteProduct extends HttpServlet{
	public ServletContext sct;
	public ProductBean pb;
	public void init()throws ServletException{
		sct=this.getServletContext();
		pb=(ProductBean)sct.getAttribute("beanRef");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pb.setId(req.getParameter("id")); 
		pb.setpName(req.getParameter("pname"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
        pb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		boolean k=new DeleteDAO().delete(pb);
		if(k==true){
			pw.println("Profile deleted successfully....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Link.html");
			rd.include(req, res);
		}
	}
}
