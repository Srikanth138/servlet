package composition;
import java.util.*;
class Student{
	int sno;
	String name;
	void get(){
		
		System.out.println(sno+" "+name);
	}
}
class Address{
	Student s=new Student();
	String aa;
	void addr(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter address");
		aa=sc.nextLine();
		System.out.println(s.sno+" "+s.name+" "+aa);
	}
}
public class OneToOne {
// Address a=new Address();
	public static void main(String[] args) {
		Address a=new Address();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number and Name");
		a.s.sno=sc.nextInt();
		a.s.name=sc.next();
			
		a.s.get();
		a.addr();
	}

}
