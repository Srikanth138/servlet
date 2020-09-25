/*Comparable ->compareTo()*/
package set;
import java.util.*;
@SuppressWarnings("rawtypes")
class Prod implements Comparable{
	private int id;
	private String name;
	Prod(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return id+" "+name;
	}
	
	public int compareTo(Object o){
		Prod p=(Prod)o;
		if (id>p.id)
			return +1;
		else
			if(id<p.id)
				return -1;
			else
		return 0;
	}
}

public class TreeSet2 {
	public static void main(String[] args) {
	TreeSet<Prod> ts=new TreeSet<Prod>();
	ts.add(new Prod(5,"xyz"));
	ts.add(new Prod(3,"efg"));
	ts.add(new Prod(1,"abc"));
	ts.add(new Prod(2,"pqr"));
	ts.add(new Prod(4,"zyx"));
	/*the predefined classes like wrapper classes and String class implements comparable interface 
	 * these objects are organized in "ascending" order.*/
	System.out.println(ts);
	ts.forEach(System.out::println);
	}

}
