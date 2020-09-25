package collections;
import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		//generics are parameterized type and generics are introduced in java 5.0 generics allows you to develop type safe collections and avoid explicit type casting.
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		//al.add(1.5f); //only add integer values 
	}

}
