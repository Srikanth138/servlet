package test;
import java.sql.*;
import java.util.*;
public class DBCConn1 {
public static void main(String args[]){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			CallableStatement cs=con.prepareCall("{Call createaccount27(?,?,?,?,?,?)}");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter accout no:");
			cs.setLong(1,Long.parseLong(sc.nextLine()));
			System.out.println("custname:");
			cs.setString(2,sc.nextLine());
			System.out.println("enter balance:");
			cs.setFloat(3,sc.nextFloat());
			System.out.println("enter AccType:");
			cs.setString(4,sc.next());
			System.out.println("enter Addres:");
			cs.setString(5,sc.next());
			System.out.println("Phone no");
			cs.setLong(6,sc.nextLong());
			boolean k=cs.execute();
			if(!k){
				System.out.println("procedure executed successfully...");
			}
			sc.close();
			con.close();
			//cs.close();
	}
	catch(ClassNotFoundException |SQLException e){
		e.printStackTrace();
	}
}

}