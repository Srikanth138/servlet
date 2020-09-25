package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	private static Connection conn=null;
	private DBconnection(){}
//	static{
	public static Connection getCon(){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
		}
		catch(Exception e){	e.printStackTrace();}
//		}
	
		return conn;
	}

}


	
	
	
			
	

