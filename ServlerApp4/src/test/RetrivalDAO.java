package test;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
public class RetrivalDAO {
	public boolean z;
	public boolean retrive(ServletRequest req,PrintWriter pw){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select *from book27 where bcode=?");
			ps.setString(1,req.getParameter("bcode"));
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				z=true;
				pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+rs.getString(3)+"&nbsp&nbsp"+rs.getFloat(4)+"&nbsp&nbsp"+rs.getInt(5));
			}
		}catch(Exception e){e.printStackTrace();}
		return z;
	}

}
