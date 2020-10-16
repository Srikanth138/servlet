package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.DBConnection.DBConnection;

public class SelectDAO {
	boolean z;
	int i;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public int select(ServletRequest req,ServletResponse res) throws SQLException, IOException, ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		con=DBConnection.getConnection();
		ps=con.prepareStatement("SELECT *FROM BOOK27 WHERE BCODE=?");
		
		String bcode=req.getParameter("bcode");
		ps.setString(1, bcode);
		
		rs=ps.executeQuery();
		
		pw.println("<table bgcolor='cyan'>");
		if(rs.next()){
			//z=true;
			System.out.println(rs.getString(2));
			pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td> "+rs.getString(4)+"</td><td> "+rs.getString(5)+"</td></tr>");
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
		
		else{
			pw.println("Wrong book Code...</br>");
			RequestDispatcher rd=req.getRequestDispatcher("select.html");
			rd.include(req, res);

		}
		pw.println("</table>");
		rs.close();
		return i;	
	}
}
