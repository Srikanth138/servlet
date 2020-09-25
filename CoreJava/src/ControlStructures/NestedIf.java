package ControlStructures;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b)
		if(a>c)
	System.out.println(a+" is greater");
		
	if(b>a)
		if(b>c)
			System.out.println(b+" is greater");
		
		else
			System.out.println(c+" is greater");
	sc.close();
	}

}
