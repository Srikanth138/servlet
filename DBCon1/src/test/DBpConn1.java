package test;
import java.sql.*;
import java.util.*;
public class DBpConn1 {
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			PreparedStatement ps=con.prepareStatement("insert into book27 values(?,?,?,?,?)");
				
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of BOOK's:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter the BCode  :");
			ps.setString(1,sc.next());
			System.out.print("Enter the BName  :");
			ps.setString(2,sc.next());
			System.out.print("Enter BAuthorName:");
			ps.setString(3,sc.next());
			System.out.print("Enter the BPrice :");
			ps.setInt(4,sc.nextInt());
			System.out.print("Enter the BQTY   :");
			ps.setInt(5,sc.nextInt());
			
			int k=ps.executeUpdate();
			if(k>0){
				System.out.println("BOOK is insertyed successfully....");
			}//if close
		}//loop close
		sc.close();
		con.close();
 		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
	}

}
