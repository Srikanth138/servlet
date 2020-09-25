//a class inside another class with static key word is called nested top level class.
//this class can access only static members of the outer class but can't non-static members.
//this class can accessible with in outer class and out side outer class.
package innerclass;
class N1{
	int a=10;
	static int b=20;
	void n1(){
		System.out.println("outside class a+b:"+a+b);
	}
	static void n2(){
		System.out.println("outside class static n2 method b:"+b);
	}
	static class N2{
		int c=10;
		void n3(){
			System.out.println("inside class static class c:"+c);
			System.out.println("outside class static class n3 method b:"+b);//out side variable
			n2(); //out side static method
		}
	}
	N2 nn=new N2();
}
public class NestedClass {

	public static void main(String[] args) {
		N1 n=new N1();
		n.n1();
		n.n2();
		n.nn.n3();
	}

}
