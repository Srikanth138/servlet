package test;
import java.sql.*;
public class UpdateDAO {
	public int k;
	public int update(ProductBean pb){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update product27 set pName=?,price=?,qty=? where id=?");//
			ps.setString(1, pb.getpName());
			ps.setFloat(2, pb.getPrice());
			ps.setInt(3, pb.getQty());
			ps.setString(4, pb.getId());
			k=ps.executeUpdate();
			}
			catch(Exception e){e.printStackTrace();}
		return k;
	}
}
