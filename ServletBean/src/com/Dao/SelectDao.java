package com.Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.DbConnection.DBConnection;

@SuppressWarnings("serial")
//@WebServlet("/select")
public class SelectDao extends GenericServlet {
	
	Connection con;
	
	public void init(){
		con=DBConnection.getCon();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String bcode=req.getParameter("bcode");
		try(PreparedStatement ps=con.prepareStatement("select bcode,bname,bauthor,bprice,bqty from book27 where bcode=?");){
			ps.setString(1,bcode);
			try(ResultSet rs=ps.executeQuery();){
				rs.next();
				pw.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				RequestDispatcher rd=req.getRequestDispatcher("link.html");
				rd.include(req, res);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
