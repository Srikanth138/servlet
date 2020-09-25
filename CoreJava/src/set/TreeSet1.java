/*TreeSet uses binary tree for organizing objects.
 * tree provide navigation method & also provide extracting setfrom tree set(like head set, tails set, sub set).
 * tree set elements/items/objects organized in asscending order or descending order .
 * this order is defined by comparable(OR)comparator interface.
 * we can't add all the objects into treeSet, we can add only the object which implements comparable interface,
 * this define default order of object of object. this comparable interface provide compare methods.
 * the predefined classes like wrapper classes and String class implements comparable interface these objects are organized in ascending order.*/
package set;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		System.out.println(ts); //print array[values]
		ts.forEach(System.out::println); // print varible indivisual.
	}

}
