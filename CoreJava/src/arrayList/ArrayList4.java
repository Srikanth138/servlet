package arrayList;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("oracle");
		al.add("python");
		System.out.println(al);
		String s1=al.get(0);
		String s2=al.get(1);
		String s3=al.get(2);
		System.out.println(s1+","+s2+","+s3);
    	}

}
