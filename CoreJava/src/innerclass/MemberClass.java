/*A class defined "inside" class is called inner class(or)nested class.*/
//***a non-static inner class of a class is called "member" class(OR) if a class is defined inside a class without "static"  key word is called "member" class.
package innerclass;
class M{ //Outer class
	int a=10;
	void m1(){
		System.out.println("outer class method m1 a:"+a);
	}
	class MM{ //Inner class
		int b=20;
		void m2(){
			System.out.println("inside class method m2 b:"+b);
			System.out.println(a+b);
		}
	}
	MM x=new MM();
}
public class MemberClass {

	public static void main(String[] args) {
		M m=new M();
		m.m1();
		m.x.m2();
	}

}
