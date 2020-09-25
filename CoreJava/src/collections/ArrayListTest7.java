package collections;
import java.util.*;
public class ArrayListTest7 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		Iterator<Integer> i=al.iterator();
		while(i.hasNext()){
			System.out.println(i);
		}

	}

}
