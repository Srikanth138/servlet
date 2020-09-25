package finals;
final class X{//final classes are not inherited(or) inorder to prevent class from inheriting it is declared as final.
	void m1(){
		System.out.println("m1 of X");
	}
	void m2(){
		System.out.println("m2 of X");
	}
}
//class Y extends X{ }
public class Class {

	public static void main(String[] args) {
		X x=new X();
		x.m1();
		x.m2();
	}

}
