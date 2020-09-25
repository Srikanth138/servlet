//final block is execute when try or catch block excution.
//final block is always excuted. final contain cleanUp code.
package exception;
import java.util.*;
public class Finally {
	public static void main(String[] args) {
		try{
			System.out.println("enter");
			Scanner sc=new Scanner(System.in);
			int n=Integer.parseInt(sc.next());
			System.out.println(n);
			sc.close();
		}
		catch(NumberFormatException e){
		    e.printStackTrace(); //this is best display error line numer also.
			//System.out.println(e.getMessage()); //this display error only.
		}
		finally{
			System.out.println("continue....");
		}
	}

}
//this program run on cmd.