/*this class implements the set interface, backed by a hash table (actually a hashmap instance).
 * it makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. this class permits the null elements.
 * HashSet():-constructs a new empty set; the backing HashMapinstance has default intial capacity (16).
 * HASHCODE:- every object is having hashcode.
 * hashcode is an integer value which is used in organizing object in hash based data structure.
 * in order to find hashcode of the object object-class provide hashCode() method.
 * this class inherited from object class into  every user defined class.
 * if two objects are equal according to equals method it must generate same hashCode value. this is object rule.
 * All pridefind class like Wrapper class String override hashCode method and equals methods.
 * whenever hashCode methodis override we need to override equals method.*/
package set;
import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
	Integer a=new Integer(10);
	Integer b=new Integer(10);
	boolean c=a.equals(b);
	System.out.println(c);
	
	System.out.println(a.hashCode());//hashCode use only wrapper and object reference use
	System.out.println(b.hashCode());
	
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	System.out.println(hs);
	hs.addAll(hs);
	System.out.println(hs);
	hs.removeAll(hs);
	System.out.println(hs);
	}
}
