package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static Connection conn=null;
	private DBconnection(){}
	static{
//		try{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
//		}
//		catch(Exception e){	e.printStackTrace();}
//		}
		
//		try{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Hots:-node52698-env-6092077.cloudjiffy.net
//			Login: root
//			Password: MDSycy61014
//			EX:- mysql_connect(‘HOST’, ‘USERNAME’, ‘PASSWORD’)
//
//			conn=DriverManager.getConnection("jdbc:mysql:///srikanth","root","root");
//			//conn=DriverManager.getConnection("jdbc:mysql://node52698-env-6092077.cloudjiffy.net/test1","root","MDSycy61014");
//			}//try
//			catch(Exception e){	e.printStackTrace();} //catch
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //`com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/srikanth","root","root");
			//conn=DriverManager.getConnection("jdbc:mysql:///srikanth","root","root");
			System.out.println("DBconnection.enclosing_method() - try");
		}
		catch (SQLException | ClassNotFoundException e) {
			System.out.println("DBconnection.enclosing_method()-catch()");
			e.printStackTrace();
		}
		}//static block

	public static Connection getCon(){
		return conn;
	}

}


	
	
	
			
	

