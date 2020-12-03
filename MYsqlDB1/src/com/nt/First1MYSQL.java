package com.nt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class First1MYSQL {

	//INSERT INTO srikanth.test1(EID,ENAME,SAL)VALUES(?,?,?);

	private static final String Query="INSERT INTO test1(EID,ENAME,SAL)VALUES(?,?,?)";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatement ps;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO..");
		int id=sc.nextInt();
		System.out.println("ENTER NAME..");
		String name=sc.next();
		System.out.println("ENTER SALARY..");
		float sal=sc.nextFloat();
		
		System.out.println("start...connection");
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("com.mysql.jdbc.Driver"); //`com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
		//jdbc:mysql://localhost:3306/?user=root
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srikanth","root","root");
		Connection con=DriverManager.getConnection("jdbc:mysql:///srikanth","root","root");
		System.out.println("connected...");
		
		ps=con.prepareStatement(Query);
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setFloat(3,sal);
		
		int k=ps.executeUpdate();
		if(k>0) {
			System.out.println("INSERTED SUCCESFULLY...");
		}
		else {
			System.out.println("NOT INSERTED....");
		}
		sc.close();
		con.close();
	}

}
