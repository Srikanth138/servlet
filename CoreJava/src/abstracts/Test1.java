/*Abstract method without body is called abstract method.
 * abstract method is declared "abstract" key word. method(;) is must.
 * abstract method define a rule which has to be followed by every sub-class.
 * when more than one sub-class is having similar rule with diff implementation's itis declared as abstract.
 * abstract method is a non-static method.
 * abstract method we can't write "inside a class" but it is define abstract class only.
 * **** Abstract class is a collection variables, non-abstract methods(concrete), abstract methods,constructor and blocks.
 * abstract class is inherited but can't used for "creating object"
 * if not override compiler gives error.
 * the class which extends abstract class is called "concrete-class".this class must override all abstract methods. */
package abstracts;
abstract class A{ //abstract class
	int a=10,b=20;
	abstract void method(); //abstract method.
	void m1(){ // concrete method
		int c=a+b;
		System.out.println(c);
	}
}
public class Test1 extends A{
	void method(){ // error.
		System.out.println("implemented method");
	}
	public static void main(String[] args) {
		//A aa=new A();	//can't create object on abstract class	//***error.
		A aa;// we can create reference variable of abstract class.
		aa=new Test1();
		aa.method();
		aa.m1();
		
		Test1 t=new Test1();
		t.method();
		t.m1();
	}

}
