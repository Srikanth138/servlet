package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.*;

@SuppressWarnings("unused")
public class DBconnection {
	private static Connection conn=null;
	private DBconnection(){}

//	static{
//		try{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
//		} //try
//		catch(Exception e){	
//			e.printStackTrace();
//			} //catch
//		}//static block
	
	public static Connection getCon() throws ClassNotFoundException, SQLException{
		String driver="com.mysql.cj.jdbc.Driver";
		
		System.out.println(driver);
		
		Class.forName(driver); 
		
		//jdbc:mysql://localhost:3306/?user=root
//		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srikanth","root","root");
		conn=DriverManager.getConnection("jdbc:mysql:///srikanth","root","root");
		System.out.println("DBconnection.getCon()-");
		return conn;
	}

}


	
	
	
			
	

