/*Array in java is reference type.->Array is a hemogenious. ->array is similar kind of data elements stored in sequancial.->an array with one subScripts is called single dim array.
 * declare:<data type><variable-name>[];
 * create: <variable-name>=new <data-type>[size];
 * initialize: <data-type><variable-name>[]=new <data-type>[size];
 * SINGLE:in single dim array data is organized,logically dividing into row and multiple columns*/
package array;

public class Single {

	public static void main(String[] args) {
		int a[]={5,6,7};
		for(int c:a)//nehanced for loop/for each loop
			System.out.println(c);
		try{
		for(int b=0;b<a.length;b++)	
		System.out.println(a[b]);
		
		int b[]=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		System.out.println(b[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){e.printStackTrace();}
	}

}
