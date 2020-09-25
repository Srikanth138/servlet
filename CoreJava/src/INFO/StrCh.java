package INFO;
import java.util.*;
public class StrCh {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String");
		String s=sc.nextLine();
		System.out.println(s);
		for(int i=0;i<s.length(); i++){
		char ch=s.charAt(i);
		System.out.println(ch);
		}
		sc.close();// other wise sc leak.
	}

}
