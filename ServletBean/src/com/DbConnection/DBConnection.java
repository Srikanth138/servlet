package com.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public DBConnection(){}
	public static Connection con;
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	public static Connection getCon(){
		return con;
		
	}
	
}
