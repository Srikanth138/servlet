//this is normal class same as all classes. but only one class or one interface.
//A class with out name is called anonymous class.
//Anonymous class extends class OR implements interface but can't do both.
//anonymous class implementation is local to one object. using this class we can create only one object.
//anonymous class is defined at the time of creating object.
package innerclass;
class A{
	void m1(){
		System.out.println("m1 of A");
	}
	void m2(){
		System.out.println("m2 of A");
	}
}
public class Anonymous{
	public static void main(String[] args) {
			A obj=new A();
			obj.m1();
			obj.m2();
	}

}
