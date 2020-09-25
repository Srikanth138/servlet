/*ArrayList is a List.
 * It is just like where objects are organized in sequance order.
 * Reaeding and writing objects are using index.
 * collections framework contain two package or collectionAPI.
 * 1>java.util 
 * 2>java.util.stream(java 8.0)*/
package collections;

import java.util.ArrayList; //util is mandetory
public class ArrayListTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		//Required type casting wheen we read objects.
		//auto boxing primitive type to wrapper type.
		Integer a=(Integer)al.get(0);
		Integer b=(Integer)al.get(1);
		Integer c=(Integer)al.get(2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		al.add(40);
		al.add(1.5f);
		al.add("java");
		for(Object o:al)//for each loop //Object is predefined class.
			System.out.println(o);
		
		al.remove(2);
		System.out.println(al);
		//insert();
	}

}
