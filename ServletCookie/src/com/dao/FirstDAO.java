package com.dao;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dbconn.DbConnection;

public class FirstDAO {
	Connection con;
	String fname;
	public String select(ServletRequest req,ServletResponse res) throws SQLException, ServletException, IOException{
		String name=req.getParameter("name");
		String pword=req.getParameter("pword");
		con=DbConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT UNAME,PWORD,FNAME FROM USERREG27 WHERE UNAME=? AND PWORD=?");
		ps.setString(1,name);
		ps.setString(2,pword);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
		if(name.equals(rs.getString(1)) && pword.equals(rs.getString(2))){
			fname=rs.getString(3);
			}
		}
		return fname;
	}

}
