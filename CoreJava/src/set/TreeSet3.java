package set;
import java.util.*;
@SuppressWarnings("rawtypes")
class IntegerComparator implements Comparator{
	public int compare(Object o1, Object o2){
		Integer x=(Integer)o1;
		Integer y=(Integer)o2;
				if(x>y)
					return -1;
				else
					if(x<y)
						return +1;
					else 
						return 0;
	}
}

public class TreeSet3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new IntegerComparator());
		ts.add(40);
		ts.add(10);
		ts.add(30);
		ts.add(20);/*the predefined classes like wrapper classes and String class implements comparable interface 
		these objects are organized in "ascending" order.*/
		ts.forEach(System.out::println);
	}

}
