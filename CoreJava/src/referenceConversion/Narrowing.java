//if super-class reference hold sub-class object.
package referenceConversion;
class A{
	void m1(){
		System.out.println("m1 of A");
	}
	void m2(){
		System.out.println("m2 of A");
	}
}
class B extends A{
	void m1(){
		System.out.println("m1 of B");
	}
	void m3(){
		System.out.println("m3 of B");
	}
}
public class Narrowing {

	public static void main(String[] args) {
		A a=new B(); //super class
		a.m1(); //overriding
		a.m2();
		//a.m3(); error
		B b=(B)a; //sub class
		b.m1(); //overriding
		b.m2();
		b.m3();
	}

}
