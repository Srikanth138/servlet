/* jagged array is double dim array/multi dimentional array with fixed number of rows and variables lenght columns.
 * the number of columns hold by each changed from one row to another.-> jagged array is reference of address.*/
package array;

public class JaggedArray {
	public static void main(String[] args) {
	try{
			int a1[]={1,2,3};
			int a2[]={1,2,3,4};
			int a3[]={1,2};
			int a[][]={a1,a2,a3};
		//int a[][]=new int[3][]; //creating array by defining row size with out column size. // 3rows no colums
		/*a[0]=new int[2];//first row 2columns
		a[1]=new int[3];//2nd row 3 columns
		a[2]=new int[1];//3rd row 1colum */
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;i++){
				a[i][j]=sum++;
				System.out.print(a[i][j]+" ");
			}System.out.println(" ");
		}
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;i++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}*/
		}catch(ArrayIndexOutOfBoundsException e){e.printStackTrace();}

	}

}