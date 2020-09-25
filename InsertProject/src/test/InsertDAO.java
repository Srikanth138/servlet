package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequest;

public class InsertDAO {
	public int k;
	public int insert(ServletRequest req){
		try{
			Connection con=DBconnection.getCon();
			PreparedStatement ps=con.prepareStatement("INSERT INTO TEST1 VALUES(?,?,?)");
			ps.setInt(1, Integer.parseInt(req.getParameter("id"))); //int is not accept directly wecan 
			ps.setString(2, req.getParameter("name"));
			ps.setInt(3, Integer.parseInt(req.getParameter("salary")));
			k=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}
}
