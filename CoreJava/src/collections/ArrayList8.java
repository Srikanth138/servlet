package collections;
import java.util.*;
public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("oracle");
		ListIterator<String> li=al.listIterator();
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.previous());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.previous());
		System.out.println(li.previous());
		System.out.println(li.previous());
	}

}
