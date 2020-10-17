package test;
import java.sql.*;
public class DBConn1 {
		public static void main(String[] args) {
		
	//System.out.println("hello");
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery("select * from emp");
	while(rs.next())
	{
	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getDate(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8));
	}//while
	con.close();
	}//try
	catch(ClassNotFoundException | SQLException e){
	e.printStackTrace();
	}//catch
		}

	}
