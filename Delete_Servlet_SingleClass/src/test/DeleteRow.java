package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DeleteRow extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
Connection con;
PreparedStatement ps;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
ps= con.prepareStatement("DELETE FROM TEST1 WHERE EID=?");
ps.setInt(1,Integer.parseInt(req.getParameter("id")));
int i = ps.executeUpdate();
if(i!=0)
pw.println("Deleting row...");
else if (i==0)
{
pw.println("<br>Row has been deleted successfully.");
}
else
	pw.println("NOT Delete...?");
}
catch(SQLException sx)
{
pw.println(sx);
}
catch(ClassNotFoundException cx)
{
pw.println(cx);
} 
}
}