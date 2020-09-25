/*an array with two subScripts is called double dim array.
 * in double dim array data is organized logically by dividing into multiple row's and column's.
 * in double dim array we can store more data compare to single dim array.
 * int a[][]=new int[row-size][column-size]; ->we can store two reference[][] into a single dim array a[][]*/
package array;
public class Double1 {
	public static void main(String[] args) {	
		int x[][]=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int y[][]={{1,2},{3,4}}; //{(00,01),(10,11)}; 
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(y[i][j]+" ");
			}
			System.out.println(" ");
		}
		int z[][]=new int[2][2];//creating another matrix to store the sum of two matrices  
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
		z[i][j]=x[i][j]+y[i][j];
		System.out.print(y[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};      
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
	}

}
