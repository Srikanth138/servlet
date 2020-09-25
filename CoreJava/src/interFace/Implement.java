/*Interface is a reference data type.
 * interface is a collection abstract-method and final-static-variables(constants)
 * interfaces define the public behavior of class.
 * interface define the specifications/set of regulations which has to be followed by every inhered class(or)implemented class.
 * by default method of interface are public and abstract interface allow only public access specifier.
 * ****a class inherit interface using implements keyword, implement one (or)more interfaces. and extends one or more.
 * implement provide reusability and extends provide reusability and extensibility.
 * the class which inherit interface is called "concrete" class it must provide implementation of all abstract methods.*/
package interFace;
interface A{//interface create only reference variable *but not create object.
	int a=20;// int a; give error *compiler create final static int a=20;
	void m1(); // compiler create *public abstract void m1();
} //interface with out body of interface and method.
class B implements A{
	public void m1(){ // public is mandatory. on implementation class
		System.out.println(a);
	}
}
public class Implement {

	public static void main(String[] args) {
		//A x=new A();can't create object on interface
		A aa;
		aa=new B();
		aa.m1();
		B b=new B();
		b.m1();
	}

}
