package com.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection con;
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return con;
	}
}
