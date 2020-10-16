package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.conn.DBConnection;


@WebServlet("/SelectDAo")
public class SelectDAo{
	
	public Connection con;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int i;
	//boolean z;
	public int select(ServletResponse res) throws IOException{
	con=DBConnection.getCon();
	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		try {
			ps=con.prepareStatement("SELECT *FROM BOOK27");
			rs=ps.executeQuery();
			pw.print("<table  bgcolor='cyan'  aline='center' boder='2'>");
			if(rs!=null){
				//z=true;
				while(rs.next()){
					pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
				}
			}
			pw.print("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return z;
		return i;	
	}
	public void destroy() {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
