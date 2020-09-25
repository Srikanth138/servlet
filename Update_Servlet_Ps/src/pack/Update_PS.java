package pack;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//  update test1 set ename='vasu',sal=1500 where eid=105;
@SuppressWarnings("serial")
public class Update_PS extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		int count=0,id=0,salary=0;
		String query=null;
		try {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("WELCOME... <br>");
			id=Integer.parseInt(req.getParameter("id"));
			String name1=req.getParameter("name");
			salary=Integer.parseInt(req.getParameter("salary"));
			
			query="UPDATE TEST1 SET ENAME=?,SAL=? WHERE EID=?";
			System.out.println(query);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			PreparedStatement smt=con.prepareStatement(query);
			smt.setString(1,name1);
			smt.setInt(2,salary);
			smt.setInt(3,id);
				count=smt.executeUpdate();
			
				if(count!=0)
					pw.println("UPDATE SUCCESSFULL...."); 
				else
					pw.println("ID IS NOT THERE IN DATABASE....");
			 con.close();
		}
	     catch(SQLException | ClassNotFoundException se) { se.printStackTrace(); }
		 
		catch(Exception e) { e.printStackTrace(); }
	} //main
} //class
