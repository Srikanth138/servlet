package queue;
import java.util.*;
public class DArrayList {
	public static void main(String[] args) {
		ArrayList<Product1> al=new ArrayList<Product1>(); //class to constructor with other program
		al.add(new Product1("A121","mouse",1200,12));
		al.add(new Product1("A122","keyboard",1300,13));
		System.out.println(al);
		
		System.out.println("==Display from ArrayList<E>  forEach====");
		for(Product1 k:al){
			System.out.println(k);
		}
		
		System.out.println( );
		al.forEach((k)->{
		System.out.println(k);
		});
		
	/*	System.out.println(" ");
		System.out.println("HashMap......");
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(101, "sri");
	hm.put(102, "patel");
	System.out.println(hm);
	hm.remove(101);//pass the key only to remove
	System.out.println(hm); */
	}

}
