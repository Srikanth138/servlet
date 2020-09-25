package INFO;
import java.util.*;
public class CharAr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("input any Character");
		  String str=sc.next();
		  char ch=str.charAt(0);
		  if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
	           System.out.println("input character is alphabet");
		  
		  else if(ch>='0' && ch<='9')
			  System.out.println("input is number");
		 
		  else 
			  System.out.println("input charactor is Special charactor");
		  sc.close();
	}
}
