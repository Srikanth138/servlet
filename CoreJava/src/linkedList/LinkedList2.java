/* this is work adding last element and removing fisrt.*/
package linkedList;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		System.out.println(ll);
		ll.addFirst(20);
		System.out.println(ll);
		ll.addLast(30);
		System.out.println(ll);
		ll.addFirst(40);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(20);
		System.out.println(ll);
	}

}
