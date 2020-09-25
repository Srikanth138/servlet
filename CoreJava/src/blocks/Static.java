/*A Block defined inside class with static keyword is called StaticBlock.
 * a block of code execute at class loading time.
 * static block is used to initialize members of the class.
 * define one or more than one static block 
 * this block is executed class loading time next allocating memory for the variable's.
 * NOTE:- static block's are only access  static varible's & static method's*/
package blocks;
class A{
	int a=10;
	static int b=20;
	
	{
		System.out.println("non static block"+a+","+b);//object creation time/ constructor calling time non-static block is executed.
	}
	
	static{ //static block is only one time executed. at class loading time.
		System.out.println("static block"+b);// can not access not static varibles.
	}
	
	A(){
		System.out.println("constructor");
	}
}

public class Static extends A {

	public static void main(String[] args) {
		A aa=new A();
		A aaa=new A();
	}
}
