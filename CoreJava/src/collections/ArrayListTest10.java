package collections;
import java.util.*;
class Employee{
	private int empno;
	private String name;
	private float salary;
	Employee(int empno,String name,float salary){
		this.empno=empno;
		this.name=name;
		this.salary=salary;
		
	}
	void getEmp(){
		System.out.println(empno+","+name+","+salary);
	}
}
public class ArrayListTest10 {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"sri",5000f));
		al.add(new Employee(102,"patel",3000f));
		al.add(new Employee(103,"srikanth",4500f));
		Iterator<Employee> i=al.iterator();
		while(i.hasNext()){
			Employee e=i.next();
			e.getEmp();
		}
	}

}
