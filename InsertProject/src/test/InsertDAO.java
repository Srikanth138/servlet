package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequest;

public class InsertDAO {
	public int k;
	//private static final String Query="INSERT INTO test(EID,ENAME,SAL)VALUES(?,?,?)";
	private static final String Query="INSERT INTO test(id,name,salary) VALUES(?,?,?)";
	public int insert(ServletRequest req){
		try{
			
			int id=Integer.parseInt(req.getParameter("id")); //int is not accept directly we can
			String name=req.getParameter("name");
			float sal=Float.parseFloat(req.getParameter("salary"));
			
			Connection con=DBconnection.getCon();
			System.out.println("connected...");
			
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setInt(1, id);  
			ps.setString(2, name);
			ps.setFloat(3, sal);
			
			System.out.println("Prepare the statement...");
			
			
			k=ps.executeUpdate();
			System.out.println("Inserted...");
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}
}
