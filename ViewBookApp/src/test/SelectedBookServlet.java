package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class SelectedBookServlet extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		Cookie c[]=req.getCookies();
		if(c==null){
			pw.println("please ! Login First...<br>");
			req.getRequestDispatcher("ULogin.html").include(req, res);
		}else{
			String bCode=req.getParameter("bcode");
			ArrayList<BookBean> al=(ArrayList<BookBean>)req.getServletContext().getAttribute("jcfRef");
			
			//@SuppressWarnings("rawtypes")
			//List l=al.stream().filter((z)->z.getbAuthor().equals(bCode)).collect(Collectors.toList());
			
			List<BookBean> l= al;  //own
			String fName=c[0].getValue();
			pw.println(fName+"'s page...<br>");
			req.getRequestDispatcher("Link.html").include(req,res);
		
			l.forEach((k)->{
				BookBean bb=(BookBean)k;
				if(bCode.equals(bb.getbCode())){ //own
				pw.println("<br>"+bb.getbCode()+"&nbsp&nbsp"+bb.getbName()+"&nbsp&nbsp"+bb.getbAuthor()+
						"&nbsp&nbsp"+bb.getbPrice()+"&nbsp&nbsp"+bb.getbQty());
				}
				/*else{
					pw.print("Wrong...");
				}*/
			});
		}
	}

}
