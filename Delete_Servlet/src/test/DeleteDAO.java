package test;
import java.sql.*;
import javax.servlet.*;
public class DeleteDAO {
	public int k;
	public int delete(ServletRequest req){
		String BCODE=null;
		try{
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement("DELETE FROM BOOK27 WHERE BCODE=?");
			if(ps!=null){
			BCODE=req.getParameter("bcode");
//				BCODE="A132";
			ps.setString(1,BCODE);
			System.out.println(BCODE);
			k=ps.executeUpdate();
			}
		}
		catch(Exception e)
		{e.printStackTrace();}
		return k;
	}
}
