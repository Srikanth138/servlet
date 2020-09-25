//final method can't "override". but "overload".
package finals;
class A{
	void m1(){
		System.out.println("inside m1 method");
	}
	final void m2(){ //final method
		System.out.println("inside m2 method");
	}
}
class B extends A{
	void m1(){
		System.out.println("override inside m1 method ");
	}
	//void m2(){ }
		void m2(int a){ // overloaded
			System.out.println("overload inside m2 method "+a);
		}
}
public class Method {

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		b.m2(10);
	}

}
