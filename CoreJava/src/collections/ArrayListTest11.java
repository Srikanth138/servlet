package collections;
import java.util.*;
public class ArrayListTest11 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity()); //10
		System.out.println(v.size()); //0
		for(int i=1;i<=15;i++)
			v.add(i);
		System.out.println(v);
		System.out.println(v.capacity()); //20
		System.out.println(v.size()); //15
		
		Vector<Integer> vv=new Vector<Integer>(5,2); //(capacity,size)
		System.out.println("capacity "+vv.capacity()); //5
		vv.add(10);
		vv.add(20);
		vv.add(30);
		System.out.println(vv);
		System.out.println(vv.capacity()); //5
		System.out.println(vv.size()); //3
	}

}
