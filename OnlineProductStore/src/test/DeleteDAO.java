package test;
import java.sql.*;
public class DeleteDAO {
		public boolean k;
		public boolean delete(ProductBean pb){
			try{
				Connection con=DBConnection.getCon();
				PreparedStatement ps=con.prepareStatement("delete from product27 where id=?");
				ps.setString(1, pb.getpName());
				ps.setFloat(2, pb.getPrice());
				ps.setInt(3, pb.getQty());
				ps.setString(4, pb.getId());
				k=ps.execute();				
			}catch(Exception e){e.printStackTrace();}
			return k;
		}
}
