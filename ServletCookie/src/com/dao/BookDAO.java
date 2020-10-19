package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.BookBean;
import com.dbconn.DbConnection;

public class BookDAO {
	ArrayList<BookBean> l;
	Connection con;
	int count;
	
	public ArrayList<BookBean> select(BookBean bb) throws SQLException{
		con=DbConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT BCODE,BNAME,BAUTHOR,BPRICE,BQTY FROM BOOK27");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		String bCode=rs.getString(1);
		
		count++;
		System.out.println(count);
		bb.setbCode(bCode);
		bb.setbName(rs.getString(2));
		bb.setbAuthor(rs.getString(3));
		bb.setbPrice(rs.getFloat(4));
		bb.setbQty(rs.getInt(5));	
		
		}
		return l;
		
	}
}
