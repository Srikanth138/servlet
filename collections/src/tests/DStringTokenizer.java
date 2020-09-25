package tests;
import java.util.*;
public class DStringTokenizer {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter String:");
			String str=sc.nextLine().trim(); //.trim(); is use or not  trim() is used to remove the vide spaces.
			StringTokenizer st=new StringTokenizer(str," ");
			
			for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i));
			
			System.out.println("===output===");
			while(st.hasMoreElements()){ //first to next
				System.out.print(new StringBuffer(st.nextToken()).reverse()+" ");
			}//end of loop
		}//end of try
	}

}
