package test;
import java.sql.*;
public class RegisterDAO {
	public int k;
	public int register(UserBean ub){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into userReg27 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getpWord());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getlName());
			ps.setString(5, ub.getAddr());
			ps.setLong(6, ub.getPhno());
			ps.setString(7, ub.getMid());
			k=ps.executeUpdate();}
			catch(Exception e){e.printStackTrace();}
		return k;
	}

}
