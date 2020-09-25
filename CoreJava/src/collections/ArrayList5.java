package collections;
import java.util.*;
import java.util.function.*;
public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(1.5f);
		al.add(2.5f);
		al.add(3.5f);
		Consumer<Float> c=(ele)->System.out.println(ele); //creating lambda 
		al.forEach(c);
		
		al.forEach((ele)->System.out.println(ele));//creating lambda as argument
		al.forEach(System.out::println);//lambda is implemented as method reference.
		
		for (int i=0;i<al.size();i++){
		System.out.println(al.get(i));	
		}	
		for(Float f:al)
			System.out.println(f);
	}

}
