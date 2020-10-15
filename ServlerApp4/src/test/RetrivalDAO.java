package test;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletRequest;
public class RetrivalDAO {
	public boolean z;
	
	/*public boolean retrive(ServletRequest req,ServletResponse res) throws IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");*/
	
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
