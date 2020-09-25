package Looping;
import java.util.*;
public class Nested {

	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	a=sc.nextInt();
	for(int i=0;i<a;i++){
		for(b=0;b<=i;b++){
	System.out.print("*");
		}
	System.out.println(" ");
	}
sc.close();
	}
}