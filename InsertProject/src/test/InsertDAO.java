package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequest;

public class InsertDAO {
	public int k;
	public int insert(ServletRequest req){
		try{
			Connection con=DBconnection.getCon();
			//INSERT INTO `srikanth`.`test1` (`EID`, `ENAME`, `SAL`) VALUES ('101', 'srikanth', '1000');
			PreparedStatement ps=con.prepareStatement("INSERT INTO TEST VALUES(?,?,?)");
			ps.setInt(1, Integer.parseInt(req.getParameter("id"))); //int is not accept directly wecan 
			ps.setString(2, req.getParameter("name"));
			ps.setFloat(3, Float.parseFloat(req.getParameter("salary")));
			k=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}
}
