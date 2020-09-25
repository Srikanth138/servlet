package array;
import java.util.*;
public class SingleScan4 {

	public static void main(String[] args) {
		int cc,s=0,m=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Index numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.println("enter numbers");
			cc=sc.nextInt();
			s+=cc;
			m*=cc;
		}
		System.out.println(s+" "+m);
		sc.close();
	}

}
