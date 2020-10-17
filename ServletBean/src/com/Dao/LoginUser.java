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
import javax.servlet.annotation.WebServlet;

import com.DbConnection.DBConnection;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginUser extends GenericServlet {
	Connection con;
	boolean z;
	
	public boolean log(ServletRequest req,ServletResponse res) throws SQLException, ServletException, IOException{
	con=DBConnection.getCon();//DBConnection.getCon(); //check error here //
	
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	
	String uname=req.getParameter("uname");
	String pword=req.getParameter("pword");
	System.out.println(uname+","+pword);
		try(PreparedStatement ps=con.prepareStatement("SELECT UNAME,PWORD FROM USERREG27 WHERE UNAME=? AND PWORD=?");){
			
			
			ps.setString(1, uname);
			ps.setString(2, pword);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
			if(uname.equals(rs.getString(1)) && pword.equals(rs.getString(2))){
				z=true;
				pw.println("Welcome :"+uname);
				RequestDispatcher rd=req.getRequestDispatcher("link.html");
				rd.include(req,res);
			}}
			else{
				pw.println("WRONG USER NAME & PASSWORD");
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.include(req,res);
			}
		}
		return z;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
			log(req,res);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
