package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class First1 extends GenericServlet{
	public void init(){
//		excution starts here only
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		String uname=null;
		int a=0,b=0,c=0,d=0;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("WELCOME TO ");
		uname=req.getParameter("name");
		/*int i=0;
		char ch=uname.charAt(i);
		pw.println(ch);*/
		pw.println(uname.toUpperCase()+"<br>");
		a=Integer.parseInt(req.getParameter("t1"));
		b=Integer.parseInt(req.getParameter("t2"));
		
		if((req.getParameter("f1")).equals("Add")){ //req.getParameter("f1") will take value(Add) to input.html and compare
		c=a+b;
		pw.println("sum :"+c);
		}
		else if(req.getParameter("f1").equals("Sub")){
		d=a-b;
		pw.println("sub :"+d);
		}
		else
			pw.print("ENTER ONLY NUMBERS");
	}
	public void destroy(){
//		close the all conection's
	}
}
