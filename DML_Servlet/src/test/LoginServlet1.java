package test;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class LoginServlet1 extends GenericServlet {
	public void inti(){
		
	}
	
	public void service(ServletRequest req,ServletResponse res) {
		int id=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String query=null;
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			
			id=Integer.parseInt(req.getParameter("id"));
			String name1=req.getParameter("name");
			//SQL> select eid,ename,sal from test1 where eid=102 and ename='sri';
			query="select eid,ename,sal from test1 where eid=?and ename=?";
			System.out.println(query);
			con=DBconnection.getCon();
			ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ps.setString(2,(name1));			
				
			
				if(ps!=null){
					rs=ps.executeQuery();
				}
				
				if(rs==null){
					System.out.println(name1+" IS NOT THERE REGISTER FIRST<br>");
					pw.println(name1+" IS NOT THERE REGISTER FIRST<br>"); //req.sendRedirectory("input.html");
					pw.println("<a href=update.html>update</a> ");
					RequestDispatcher rd=req.getRequestDispatcher("insert.html");
					rd.include(req, res);
				}
				if(rs!=null){
				    rs.next();
					if(id==rs.getInt(1)  && rs.getString(2).equalsIgnoreCase(name1)){
					pw.println("WELCOME  "+ name1.toUpperCase()+".. Sir <br>");
					pw.println("ID     :"+rs.getInt(1)+"</br>");
					pw.println("NAME   :"+rs.getString(2)+"</br>");
					pw.println("salary :"+rs.getInt(3)+"</br>");
					pw.println("<a href=delete.html>delete</a> ");
					pw.println("<a href=update.html>update</a> ");
					}
			
				else{
					pw.println(name1+" IS NOT THERE REGISTER FIRST<br>"); //req.sendRedirectory("input.html");
					RequestDispatcher rd=req.getRequestDispatcher("insert.html");
					rd.include(req, res); 
				    }
			      }
				}
	     catch(SQLException se) { se.printStackTrace(); }
		 
		catch(Exception e) { e.printStackTrace(); }
		finally{
			try{
				if(rs!=null)
					rs.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(ps!=null)
					ps.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	} //main
	public void destroy(){
		
	}
}//class
