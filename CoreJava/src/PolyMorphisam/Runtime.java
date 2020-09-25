/* an ability of a reference variable change is behavior based on the type of object assigned is called runtime polymorphisam.
 * In runtime polymorphisam we create reference variable of "super-class" and assign object of "sub-class".
 * ** To develop loosely coupled code.*/
package PolyMorphisam;

class A{
		void m1(){
			System.out.println("m1 of A");
		}
	}
class B extends A{
		void m1(){
			System.out.println("overriding method m1 of B");
		}
	}
class C extends A{
		void m1(){
			System.out.println("overriding method m1 of C");
		}
	}
public class Runtime {
	public static void main(String[] args) {
		A obja; //we can pass the run time  
		
		obja=new A();
		obja.m1();
		obja=new B();
		obja.m1();
		obja=new C();
		obja.m1();
	}

}
