package Encapsulation;
class Student{
	int rollno;
	String name;
}
public class DynamicLoading {

	public static void main(String[] args) {
		Student st1=new Student();
		Student st2=new Student();
		st1.rollno=101;
		st1.name="Sri";
		st2.rollno=102;
		st2.name="Patel";
		System.out.println(st1.rollno+","+st1.name);
		System.out.println(st2.rollno+","+st2 .name);
	}

}
