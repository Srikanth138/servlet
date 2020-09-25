/*A class which allows you to create only one object is called "singleton class"
 * singleton class is  a design pattern meant provide one and only one instance of an object. other objects can get a reference to this instance through
 * a "static" method. and the method is reference type of class. returns a address of object.
 * class constructor is kept "private".
 * this has advantages in memory management.*/

class A{
	private static A obj; //reference of class
	static { //we can create object on static block. be cause static block execute first.
		obj=new A();
	}
	private A(){ //private constructor create object only with in the class. //private visible with in the class only
		System.out.println("This is private constructor");
	}
	static A method(){ // static method bind with class name
		System.out.println("this is static method");
		return obj;
	}
}
public class SingletonClass {
	
	public static void main(String[] args) {
		//A obj1=new A();
		A obj1=A.method();
		System.out.println(obj1); //display the hash code
	}

}
