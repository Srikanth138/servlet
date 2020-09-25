//javap class-name
/*the constructor of subclass calls the constructor of super-class
 * 1. implicit calling(compiler)
 * 2. explicit calling(programmer)
 * This is refer the "current" class(with in the class)
 * super is refer the "super" class(use the sub-class)
 * */
package supeR;

class A{
	int a=10;
	void aa(){
		System.out.println("this is super class "+a);
	}
}
class B extends A{
	B(){
		// this is programmer call.
	super(); //the sub-class constructor is call in super-class constructor in side constructor call only.
	super.a=30; //with in sub-class constructor we call the super class variable inisitialization.
	super.aa(); //with in sub-class constructor we can call the super class method.
	}
	int b=20;
	void add(){
		int c=a+b;
		System.out.println("this is child class :"+c);
	}
}	
public class Super {

	public static void main(String[] args) {
		A obj=new A();
		obj.aa();
		
		B obj1=new B();
		obj1.aa();
		obj1.add();
	

	}

}
