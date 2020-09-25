package test;
import java.sql.*;
public class UpdateDAO {
	public int k;
	public int update(UserBean ub){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update userReg27 set fname=?,addr=?,phno=?,mid=? where uname=? and pword=?");// uname is error
			ps.setString(1, ub.getfName());
			ps.setString(2, ub.getlName());
			ps.setString(3, ub.getAddr());
			ps.setLong(4, ub.getPhno());
			ps.setString(5, ub.getMid());
			ps.setString(6, ub.getuName());
			ps.setString(7, ub.getpWord());
			k=ps.executeUpdate();
			}
			catch(Exception e){e.printStackTrace();}
		return k;
	}
}
