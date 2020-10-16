package com.DAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.DBConnection.DBConnection;

public class InsertDAO {
	boolean z;
	int i;
	Connection con;
	PreparedStatement ps;
	public int insert(ServletRequest req,ServletResponse res) throws SQLException, IOException, ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		con=DBConnection.getConnection();
		//INSERT INTO BOOK27 VALUES('A123','java','jamsgously',152.20,15);
		ps=con.prepareStatement("INSERT INTO BOOK27 VALUES(?,?,?,?,?)");
		
		ps.setString(1,req.getParameter("bcode"));
		ps.setString(2,req.getParameter("bname"));
		ps.setString(3,req.getParameter("author"));
		ps.setFloat(4,Float.parseFloat(req.getParameter("price")));
		ps.setInt(5,Integer.parseInt(req.getParameter("qty")));
		
		i=ps.executeUpdate();
		
		if(i!=0){
			System.out.println("INSERTED..");
			pw.println("Inserted Succefully....");
			RequestDispatcher rd=req.getRequestDispatcher("select.html");
			rd.include(req, res);
		}
		else{
			pw.print("INSERTION FAIL...");
			RequestDispatcher rd=req.getRequestDispatcher("insert.html");
			rd.include(req, res);
		}
		ps.close();
		return i;	
	}
}
