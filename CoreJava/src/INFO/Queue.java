package INFO;
import java.util.*;
public class Queue {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ruby");
		al.add("lain");
		al.add("john");
		al.add("ruby");
		al.add("pete");
		System.out.println(al);
		System.out.println("2:"+al.get(2));
		System.out.println("0:"+al.get(0));
		LinkedList ll=new LinkedList();
		ll.addFirst("Ruby");
		ll.addFirst("lain");
		ll.addFirst("john");
		ll.addFirst("ruby");
		ll.addFirst("pete");
		System.out.println(ll);
		ll.removeLast();
		ll.removeLast();
		System.out.println(ll);

	}

}
