package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DbConnection.DBConnection;
import com.bean.BeanClass;

public class EdittDao {
	
	Connection con=DBConnection.getCon();
	int e;
	public int edit(BeanClass bb) throws SQLException {
		
		/*try(PreparedStatement pss=con.prepareStatement("select bcode,bname,bauthor,bprice,bqty from book27 where bcode=?");){
			
			pss.setString(1,bcode);
			ResultSet rs=pss.executeQuery();
			
			String bname=rs.getString(2);	//bb.getbCode();
			String bauthor=rs.getString(3);	//bb.getbCode();
			float bprice=rs.getFloat(4);	//bb.getbPrice();
			int bqty=rs.getInt(5);			//bb.getbQty();
		 	} //try1 */			
		try(PreparedStatement pse=con.prepareStatement("update book27 set bname=?,bauthor=?,bprice=?,bqty=? where bcode=?");){
			
			String bcode=bb.getbCode();
			
			String bname=bb.getbName();
			String bauthor=bb.getbAuthor();
			float bprice=bb.getbPrice();
			int bqty=bb.getbQty();	
			
			
			pse.setString(1,bname);
			pse.setString(2,bauthor);
			pse.setFloat(3, bprice);
			pse.setInt(4,bqty);
			pse.setString(5,bcode);
			
			e=pse.executeUpdate();
			
		}//try2 
		
		catch (SQLException ee) {
			ee.printStackTrace();
		}
		return e;
	}
}
