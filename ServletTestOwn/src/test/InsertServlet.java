package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InsertServlet {
	public void init(){

	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		Connection con=null;
		PreparedStatement ps=null;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println(req.getParameter("bcode"));
		pw.println(req.getParameter("bname"));
		pw.println(Float.parseFloat(req.getParameter("price")));
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		if(con!=null){
		ps=con.prepareStatement("insert into(bcode,bname,price) book27 values(?,?,?)");
		}
		if(ps!=null){
			ps.setString(1, req.getParameter("bcode"));
			ps.setString(2, req.getParameter("bname"));
			ps.setFloat(3, Float.parseFloat(req.getParameter("price")));
			int k=ps.executeUpdate();
			pw.println("BOOK DETAILS ARE INSERTED...");
		}
		else
			pw.println("BOOK DETAILS ARE  NOT INSERTED...");
		}
		catch(SQLException | ClassNotFoundException se){
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(con!=null)
					con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
}
	public void destory(){
//		close the all conection's
	}
}
