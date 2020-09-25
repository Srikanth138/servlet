package queue;
import java.util.*;
public class DemoQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(new Integer(12));
		pq.add(new Integer(14));
		pq.add(new Integer(12));
		System.out.println(pq);
		
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(new Integer(100));
		ad.add(new Integer(101));
		ad.add(new Integer(102));
		System.out.println(ad);
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(new Integer(200));
		ll.add(new Integer(201));
		ll.add(new Integer(202));
		System.out.println(ll);
	}

}
