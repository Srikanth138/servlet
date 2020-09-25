package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
@SuppressWarnings("serial")
public class UpdateProduct extends HttpServlet{
	public ServletContext sct;
	public ProductBean pb;
	public void init()throws ServletException{
		sct=this.getServletContext();
		pb=(ProductBean)sct.getAttribute("beanRef");
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pb.setId(req.getParameter("id")); 
		pb.setpName(req.getParameter("pname"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
        pb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		int k=new UpdateDAO().update(pb);
		if(k>0){
			pw.println("Profile update successfully....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Link.html");
			rd.include(req, res);
		}
	}
}
