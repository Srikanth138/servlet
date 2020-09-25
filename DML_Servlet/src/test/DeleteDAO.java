package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletRequest;

public class DeleteDAO {
	 public int k;
	// ps=null;
	public int delete(ServletRequest req){
		try{
			Connection con=DBconnection.getCon();
			PreparedStatement ps= con.prepareStatement("DELETE FROM TEST1 WHERE EID=?");
			ps.setInt(1,Integer.parseInt(req.getParameter("id")));
			 k = ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}

}
