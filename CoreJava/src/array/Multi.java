package array;

public class Multi {

	public static void main(String[] args) {
		int[][] myarray = new int[2][2];
        myarray[0][0] = 1;
        myarray[0][1] =  myarray[1][0] =  0;
        myarray[1][1] = 1;
        System.out.println("Array elements are:");
        System.out.println(myarray[0][0] + " " +myarray[0][1]);
        System.out.println(myarray[1][0] + " " +myarray[1][1]);
        
		int a[][]=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j]=i+1; //
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		int b[][]={{1,2},{3,4}}; //{(00,01),(10,11)}; 
		for(int i=0;i<2;i++){
			for(int k=0;k<2;k++){
				System.out.print(b[i][k]+" ");
			}
			System.out.println(" ");
		}
	}

}
