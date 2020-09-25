package lambda;
@FuncationalInterface
interface A{ //interface.
	void display();//abstract method. 
}
public class Lambda { //class
	public static void main(String args[]){ //main method
		A obj=()-> System.out.println("hello lamda"); //A is class.//obj is reference. //()-> method implementation. //only one statement.//more stmt's use { }
		obj.display();//method call.
	}
}
