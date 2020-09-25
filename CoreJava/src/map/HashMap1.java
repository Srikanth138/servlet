/*Map:-A map is an object that maps keys to values.
 * a map can't contain dublicate keys:Each key can map to at most one value.
 * the map interface provide three collection views, which allow a map's contents to be viewed as a set of keys,collection of values or set of key-value mappings.
 * HASHMAP:-is a map based collection which is used to store "key and value" pairs. it is not ordered collecion it means not return key.*/
package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,Float> hm=new HashMap<String,Float>();
		hm.put("java", 200.0f); //key can't dublicate , can value alowed to dublicate.
		hm.put("oracle", 500.0f);
		hm.put(".net", 100.f);
		System.out.println(hm); //{key,value} paire
		
		Set<String> courses=hm.keySet();
		Collection<Float> fees=hm.values();
		courses.forEach(System.out::println);
		fees.forEach(System.out::println);
		
		System.out.println(hm.get("java")); //mention only "key" find to value
	}

}
