package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public DBConnection(){} //constructor
	
	public static Connection con;
	
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //optional ojdbc6.jar
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	} // end static block
	
	public static Connection getCon(){
		return con;
	}
	

}
