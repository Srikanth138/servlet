/*wrapperClasses are exist in java.lang package.
 *  "   "  is a class, which wrap primitive data type.
 *  "   "  are used to represent primitive data type as object type.
 *  1.wrapper classes provide methods to convert one type of value to another type.
 *  2.wrapper classes are used to provide in collection Storing primitive typrs.
 *  ***They convert primitive data type into object.
 *  object are needed it we with to modify the arguments passed in to a method.*/
package wrappperClasses;

public class Wrapper {
	public static void main(String[] args) {
		Byte b=new Byte((byte) 10);// this is not available.
		Short s=new Short((short) 20);
		Integer i=new Integer(30);
		Long l=new Long(100);
		Float f=new Float(1.5f);
		Double d=new Double(15.50);
		Boolean bb=new Boolean(true);
		Character ch=new Character('s');
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
		System.out.println(ch);
		String str=String.valueOf(d);//any value convert
		System.out.println(str);
	}

}
