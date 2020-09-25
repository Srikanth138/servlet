package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ViewBooksServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Cookie c[]=req.getCookies();
		if(c==null){
			pw.println(" please ! Login first....<br>");
			req.getRequestDispatcher("Login.html").include(req, res);
			}else{
				String fName=c[0].getValue();
				pw.println(fName+"'s page...<br>");
				ArrayList<BookBean> al=new RetriveDAO().retrive();
				if(al.size()==0){
					pw.println("NO Books found...<br>");
				}else{
					req.getServletContext().setAttribute("jcfRef", al);
					al.forEach((k)->
					{
						BookBean bb=(BookBean)k;
						pw.println("<a href='select?bcode="+bb.getbCode()+"'>"+bb.getbCode()+"</a>");
						pw.println("&nbsp&nbsp"+bb.getbName());
					});
				}
			}
	}
}
