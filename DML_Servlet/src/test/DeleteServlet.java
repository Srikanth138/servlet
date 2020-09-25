package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class DeleteServlet 	extends GenericServlet {
		public DeleteDAO dd;
		public void init(){
			dd=new DeleteDAO();
		}
		public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			int k=dd.delete(req); //method 
			if(k!=0)
				pw.println("DETAILES ARE SUCCESFULLY DELETE....<br>");
			else
				pw.println("NOT DELETED..? <br>");
			
			pw.println("<a href=Login.html>logout</a> ");
		}


}
