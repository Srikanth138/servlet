/*the java throw keyword is used to generate or throw exception explicitly.(throw an exception from a method (or)any block of code).
 * throw keyword id used to generate checked exception, unchecked OR "user define exception".
 * the method can generate exception explicit using throw keyword.
 * generating exception is nothing but creating exception object and giving to jvm.
 * ->SYNTAX:-throw new Exception-type();*/

package exception;
import java.util.*;
public class Throw {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try{
			if(n1==0 || n2==0)throw new ArithmeticException();
			else 
				System.out.println("result is :"+(n1*n2));
		}
		catch(ArithmeticException e){
			System.out.println("can't multiply number with zero");
		}sc.close();
	}

}
