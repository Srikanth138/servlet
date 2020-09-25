package tests;
import java.util.*;
public class DStringJoiner {
	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in);){
	StringJoiner sj=new StringJoiner("-"); //-,=....
	System.out.println("enter date:");
	sj.add(sc.nextLine());
	System.out.println("enter month:");
	sj.add(sc.nextLine());
	System.out.println("enter year:");
	sj.add(sc.nextLine());
	System.out.println("Date of Birth:"+sj.toString()); //sj.toString()
	
	}
	}

}
