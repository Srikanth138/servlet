package Looping;
import java.util.*;
public class While {

	public static void main(String[] args) {
		int a; //initialize
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		a=sc.nextInt();
		while(a<=10) //condition
		{
		System.out.println("how many times"+a);	
		a++; //increment/update
		}
		sc.close();
		while(true){
			// print infinate times
			System.out.println("successfully completed");
		}// can't be reached 
	   //while(1) // not conver to boolean values
			//System.out.println("can't convert ");
	}

}
