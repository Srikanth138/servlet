package test;
import java.sql.*;
import java.util.*;
public class RetriveDAO {
	public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrive(){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from product27");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ProductBean pb=new ProductBean();
				pb.setId(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setPrice(rs.getFloat(3));			
			    pb.setQty(rs.getInt(4));
			    al.add(pb);
			    }//end loop
		}catch(Exception e){e.printStackTrace();}
		return al;
	}
}
