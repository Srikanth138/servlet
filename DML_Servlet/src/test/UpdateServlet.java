package test;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class UpdateServlet extends GenericServlet {
	public void inti(){
		
	}
	public void service(ServletRequest req,ServletResponse res) {
		int count=0,id=0,salary=0;
		String query=null;
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			id=Integer.parseInt(req.getParameter("id"));
			String name1=req.getParameter("name");
			salary=Integer.parseInt(req.getParameter("salary"));
			
			query="UPDATE TEST1 SET ENAME=?,SAL=? WHERE EID=?";
//			System.out.println(query);
			Connection con=DBconnection.getCon();
			PreparedStatement smt=con.prepareStatement(query);
			smt.setString(1,name1);
			smt.setInt(2,salary);
			smt.setInt(3,id);
				count=smt.executeUpdate();
				
				if(count!=0){
					pw.println("UPDATE SUCCESSFULL.... <br>");
				    pw.println("<a href=delete.html>dalete</a> ");
				}
				else
					pw.println("ID IS NOT THERE IN DATABASE.... <br>");
				
				pw.println("<a href=Login.html>logout</a> ");
			 con.close();
		}
	     catch(SQLException se) { se.printStackTrace(); }
		 
		catch(Exception e) { e.printStackTrace(); }
	} //main
} //class
