package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO {
	public int k;
	public int insert(ServletRequest req){
		try{
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement("insert into book27 values(?,?,?,?,?)");
			ps.setString(1,req.getParameter("bcode"));
			ps.setString(2,req.getParameter("bname"));
			ps.setString(3,req.getParameter("bauthor"));
			ps.setFloat(4,Float.parseFloat(req.getParameter("bprice")));
			ps.setInt(5,Integer.parseInt(req.getParameter("bqty")));
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{e.printStackTrace();}
		return k;
	}
}
