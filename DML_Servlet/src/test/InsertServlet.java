package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class InsertServlet extends GenericServlet {
	public InsertDAO id;
	public void init(){
		id=new InsertDAO();
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=id.insert(req); //method 
		if(k!=0){
			pw.println("DETAILES ARE SUCCESFULLY INSERTED....<br>");
		    pw.println("<a href=update.html>update</a> ");
		    pw.println("<a href=delete.html>dalete</a> ");
		}
		else
			pw.println("NOT INSERTED..? <br>");
		
		pw.println("<a href=Login.html>logout</a> ");
	}

}
