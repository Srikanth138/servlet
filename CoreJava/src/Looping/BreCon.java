package Looping;
import java.util.*;
public class BreCon {
public static void main(String[] args) {
int a,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	//a=sc.nextInt();
	for(i=0;i<=20;i++){
		if(i%2==0)
		continue; //continue will print the next number/element.
		System.out.println(i);
		
	}
}
}
