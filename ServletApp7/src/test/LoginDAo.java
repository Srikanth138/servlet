package test;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
public class LoginDAo {
	public boolean z;
	public boolean login(ServletRequest req,ServletContext sct){
		try{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select *from UserReg27 where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				z=true;
				sct.setAttribute("fName", rs.getString(3));
				UserBean ub=new UserBean();
				ub.setuName(rs.getString(1));
				ub.setpWord(rs.getString(2));
				ub.setfName(rs.getString(3));
				ub.setlName(rs.getString(4));
				ub.setAddr(rs.getString(5));
				ub.setPhno(rs.getLong(6));
				ub.setMid(rs.getString(7));
				sct.setAttribute("beanRef", ub);
			}//end of if
		}
		catch(Exception e){e.printStackTrace();}
		return z;
	}
}
