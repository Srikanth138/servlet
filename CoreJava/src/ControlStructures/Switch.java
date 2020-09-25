package ControlStructures;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		a=sc.nextInt();
		switch (a)
		{
		case 10:
			System.out.println("this is ten");
			break;
		case 20:
			System.out.println("this is twonty");
			break;
		default:
			System.out.println(" invalid number");
		}
		sc.close();
	}

}
