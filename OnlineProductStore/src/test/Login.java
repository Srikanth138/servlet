package test;
	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.http.*;
	@SuppressWarnings("serial")
	public class Login  extends HttpServlet{
		public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			String fName=new LoginDAO().login(req);
			String pName=new LoginDAO().login(req);
			if(fName==null){
				pw.println("Invalid userName or Password...<br>");
				req.getRequestDispatcher("Login.html").include(req, res);
				}
			else 
				if(pName.equals("sri")) 
				{
					HttpSession hs=req.getSession();
					hs.setAttribute("name", pName);
					pw.println("Welcome Admin...."+pName+"<br>");
					pw.println("<a href='view'>ViewProduct</a>");
					pw.println("<a href='add'>AddProduct</a>");
					pw.println("<a href='del'>DeleteProduct</a>");
					pw.println("<a href='edit'>EditProduct</a>");
					pw.println("<a href='logout'>LogoutAdmin</a>");
					//pw.println("<a href='Login.html'>LogoutUser</a>");
					
			}
			else 
			{
				HttpSession hs=req.getSession();
				pw.println("Welcome User...."+fName+"<br>");
				hs.setAttribute("name", fName);
				pw.println("<a href='view'>ViewProduct</a>");
				pw.println("<a href='logout'>LogoutUser</a>");
				//pw.println("<a href='Login.html'>LogoutUser</a>");
		}
			
	}
}
