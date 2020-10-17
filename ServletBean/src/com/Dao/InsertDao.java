package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.DbConnection.DBConnection;
import com.bean.BeanClass;

public class InsertDao {
	int k;
	public int insert(BeanClass bb)  {
		Connection con=DBConnection.getCon();
		try(PreparedStatement ps=con.prepareStatement("INSERT INTO BOOK27 VALUES(?,?,?,?,?)");){
			
			ps.setString(1,bb.getbCode());
			ps.setString(2,bb.getbName());
			ps.setString(3,bb.getbAuthor());
			ps.setFloat(4,bb.getbPrice());
			ps.setInt(5,bb.getbQty());
			k=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return k;
	}

}
