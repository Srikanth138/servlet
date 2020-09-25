package composition;
import java.util.*;
class Coures{
	String coures;
	void cc(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter coures name");
		coures=sc.next();
	}
	void cou(){
		System.out.println(coures);
	}
}
class Subjects{
	Coures c=new Coures();
	String sub1;
	String sub2;
	String sub3;
	void sub(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subjects names");
		sub1=sc.next();
		sub2=sc.next();
		sub3=sc.next();
	}
	void get(){
	System.out.println(sub1+" "+sub2+" "+sub3);
	}
}
public class OneToMany {
public static void main(String[] args) {
	Subjects s=new Subjects();
	Subjects s1=new Subjects();
	s.c.cc();
	s.sub();
	s1.sub();
	s.c.cou();
	s.get();
	s1.get();
	
}
}
