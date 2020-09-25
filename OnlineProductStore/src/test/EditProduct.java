package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class EditProduct extends HttpServlet{
	public ServletContext sct;
	public ProductBean pb;
	public void init()throws ServletException{
		sct=this.getServletContext();
		pb=(ProductBean)sct.getAttribute("beanRef");
	}//doGet
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<form action='update' method ='post'>");//line no 21
		pw.println("Id         : <input type='text' name='id' value='"+pb.getId()+"'><br>");
		pw.println("productName: <input type='text' name='pname' value='"+pb.getpName()+"'><br>");
		pw.println("price      : <input type='text' name='price' value='"+pb.getPrice()+"'><br>");
		pw.println("Qty        : <input type='text' name='qty' value='"+pb.getQty()+"'><br>");
		//pw.println("<form action='update' method ='post'>");
		pw.println("<input type='submit' value='UpdateProduct'>");
		pw.println("</form>");
		
	}
}
