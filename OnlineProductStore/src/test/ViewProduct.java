package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ViewProduct extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Cookie c[]=req.getCookies();
		if(c==null){
			pw.println(" please ! Login first....<br>");
			req.getRequestDispatcher("Login.html").include(req, res);
			}else{
				String pName=c[0].getValue();
				pw.println(pName+"'s product...<br>");
				ArrayList<ProductBean> al=new RetriveDAO().retrive();
				if(al.size()==0){
					pw.println("NO Products found...<br>");
				}else{
					req.getServletContext().setAttribute("jcfRef", al);
					al.forEach((k)->
					{
						ProductBean pb=(ProductBean)k;
						pw.println("=====product details=====<br>");
						pw.println("Id :"+pb.getId()+"<br>");
						pw.println("pName :"+pb.getpName()+"<br>");
						pw.println("price  :"+pb.getPrice()+"<br>");
						pw.println("Qty  :"+pb.getQty()+"<br>");
						pw.println("<a href='logout'>LogoutUser</a>");
						//pw.println("<a href=Login.html>Logout</a>");
					});
				}
			}
	}
}
