/*object is a predefined class in java.  it is root class for the classes in java.
 * this class is exist in java.lang package.*/

class Student{
	private int rno;
	private String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public String toString(){
		
		return rno+" "+name;
	}
}
public class ObjectClass {

	public static void main(String[] args) {
		Student stud1=new Student(101,"srikanth");
		System.out.println(stud1.toString());
		System.out.println(stud1);

	}

}
