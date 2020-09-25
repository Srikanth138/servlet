package test;
import java.sql.*;
import javax.servlet.http.*;
public class LoginDAO {
	public String fName;
	public String login(HttpServletRequest req){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select *from userreg27 where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				fName=rs.getString(3);
			}
		}
		catch(Exception e){e.printStackTrace();}
		return fName;
	}
}
