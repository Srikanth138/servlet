/*capacity increment formula:
 * before java 7.0 :int new capacity=(oldCapacity*3)/2+1 
 * after java 7 :int new Capacity=(old capacity+old capacity)**/
package collections;
import java.util.*;
public class ArrayList2{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList(3);//old capacity+old capacity
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		//al.wait(100); //throws InterruptedException
		
		al.remove(2); //delete only one element
		System.out.println(al);
		
		al.clear(); //delete all data elements
		System.out.println(al);
		
		}
}
