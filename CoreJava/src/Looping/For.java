//tables
package Looping;
import java.util.*;
public class For {

	public static void main(String[] args) {
		int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a values");
	a=sc.nextInt();
	for(b=1;b<=a;b++){
		for(int c=1;c<=10;c++){
			System.out.println(b+"*"+c+"="+(b*c));
		}
	}
	sc.close();
	}

}
