/*if method is generating checked exception it must be handled using "try and catch".
 * if not it can "forword" that exception to the caller using throws keyword.
 * Syntax:-void main()throws Exception-type{ }.*/
package exception;
import java.util.*;
class LoginException extends Exception{
	LoginException(String description){ //class name (parameter).
		super(description); //super class constructer.
	}
}
public class Throws {
	static void login(String user, String pwd)throws LoginException{ //forword
		if(user.equals("nit") && pwd.equals("nit123"))
			System.out.println("welcome...");
		else
			throw new LoginException("invalid"); //genarating //user define exception
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String user=sc.next();
		System.out.println("enter user name");
		String pwd=sc.next();
		try{
			login(user,pwd);
				
			/*if(user.equals("nit") && pwd.equals("nit123"))
					System.out.println("welcome...");
				else
					throw new LoginException("invalid"); */
		}
		catch(LoginException x){
		   System.out.println(x.getMessage());
		}
		sc.close();
	}

}
