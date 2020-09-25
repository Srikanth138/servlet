package exception;
import java.util.*;
public class EXtest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		System.out.println("enter any number");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(a+"devided by"+b+" "+c);
		}
			catch(ArithmeticException e){
				//e.printStackTrace(); //me write time pass remove this stmt
				//System.out.println(e.getMessage()); // /by zone
				System.out.println(" Zero is can not devide:"+a);				
			}
		sc.close();
	}

}
