//UnBoxing:- is introduced in java5.0 version.
//UnBoxing:-is process of converting "WrapperType to PrimitiveType".
package wrappperClasses;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer i=new Integer(10);
		int a=i;
		System.out.println(a);
		
		Integer i1=20;
		int a1=i1;
		System.out.println(a1);
		
		String s="100";
		int a2=Integer.parseInt(s);
		System.out.println(a2);
	}

}
