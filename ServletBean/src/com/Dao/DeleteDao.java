package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DbConnection.DBConnection;
import com.bean.BeanClass;

public class DeleteDao {
	public int d;
	public int delete(BeanClass bb){
		Connection con=DBConnection.getCon();
		try(PreparedStatement ps=con.prepareStatement("DELETE FROM BOOK27 WHERE BCODE=?")){
			
		String bcode=bb.getbCode();
		ps.setString(1,bcode);
 
		d=ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return d;
	}

}
