package composition;
import java.util.*;
class Car{
	private String name;
	void setCarName(Scanner sc){
		System.out.println("enter car name");
		name=sc.next();
	}
	void getCarName(){
		System.out.println("car name is :"+name);
	}
}
class Engine{
	Car c=new Car();	
	Car c1=new Car();	
	int cc;
	void setcc(Scanner sc){
		System.out.println("enter car capacity");
		cc=sc.nextInt();
	}
	void getcc(){
		System.out.println("car name is :"+cc);
	}
}
public class ManyToMany {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engine e=new Engine();
		e.c.setCarName(sc);
		e.setcc(sc);
		Engine e1=new Engine();
		e1.c1.setCarName(sc);
		e1.setcc(sc);
		
		e.c.getCarName();
		e.getcc();
		e1.c1.getCarName();
		e1.getcc();
	}

}
