package map;
import java.util.*;
public class DemoMap {
   public static void main(String[] args) {
		HashMap<String,Product1> hm=new HashMap<String,Product1>(); //with out any order
		System.out.println("==HashMap display==");
		hm.put("A121", new Product1("name",1200,12));
		hm.put(new String("A122"), new Product1("key",1300,13));
		hm.put(new String("A120"), new Product1("mouse",1400,14));
		hm.put("A121", new Product1("name",1200,12));
		hm.put(null, new Product1("mam",12,12));
		System.out.println(hm);
		
		LinkedHashMap <String,Product1> lhm=new LinkedHashMap<String,Product1>(); //organize elements in insertion order.
		System.out.println("==LinkedHashMap display==");
		lhm.put("A121", new Product1("name",1200,12));
		lhm.put(new String("A122"), new Product1("key",1300,13));
		lhm.put(new String("A120"), new Product1("mouse",1400,14));
		lhm.put("A121", new Product1("name",1200,12));
		lhm.put(null, new Product1("mam",12,12));
		lhm.forEach((k,v)->{
		System.out.println(k+"\t"+v);
		});
		
		TreeMap<String,Product1> tm=new TreeMap<String,Product1>();//elements in Ascending order.
		System.out.println("==TreeMap display==");
		tm.put("A121", new Product1("name",1200,12));
		tm.put(new String("A122"), new Product1("key",1300,13));
		tm.put(new String("A120"), new Product1("mouse",1400,14));
		tm.put("A121", new Product1("name",1200,12));
//		tm.put(null, new Product1("mam",12,12)); //not allowd null keys
		tm.forEach((k,v)->{
		System.out.println(k+"\t"+v);
		});
		
		Hashtable<String,Product1> ht=new Hashtable<String,Product1>(); //Hashtable table 't' always small.
		System.out.println("==Hashtable display=="); //hashtable is synchronized class and remaing classes are Non-Synchronized classes.
		ht.put(new String("A121"), new Product1("name",1200,12));
		ht.put(new String("A122"), new Product1("key",1300,13));
		ht.put(new String("A120"), new Product1("mouse",1400,14));
		ht.put("A121", new Product1(null,1200,12));
		ht.put(null, new Product1(null,12,12)); //not allowd null keys
		ht.forEach((k,v)->{
		System.out.println(k+"\t"+v);
		});
	}

}
