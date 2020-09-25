package array;
import java.util.*;
public class DoubleScan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		int n=sc.nextInt();
		System.out.println("enter columns");
		int m=sc.nextInt();
		
		int a[][]=new int[n][m];
		System.out.println("enter the elements");
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				a[i][j]=sc.nextInt();//store here values
			}
		
				for(int i=0;i<n;i++){
					for(int j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
					}
			System.out.println(" ");
			}sc.close();
	}

}
