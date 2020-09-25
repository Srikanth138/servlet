/* 1.loading super class first
 * 2.At the class loading time memory is allocated static variable first.on super class.
 * 3.static block is executed 3nd.after allocating the memory of static variables.
 * 4.loading sub class.
 * 5.allocating memory for the static variables of the sub-class.
 * 6.execute static block of sub-class.
 * 7.create object by allocating memory for non-static variable of super class. and sub class.
 * 8.execute non-static block of super-class.
 * 9.execute constructor of super-class.
 * 10.execute non-static block of sub-class.
 * 11.execute constructor of sub-class.*/

package blocks;
class B{
	static int a=10;
	int b=20;
	static{ 
		System.out.println("Static block of super class");
		System.out.println("");
	}
	{
		System.out.println("Non-Static block super class");	
		System.out.println("");
	}
	B(){
		System.out.println("constructor of super class");
		System.out.println("");
	}
	void aa(){
		System.out.println("super class method"+a+b);
	}
}
class C extends B{
	static int p=10;
	int q=20;
	static{ 
		System.out.println("Static block of sub class");
		System.out.println("");
	}
	{
		System.out.println("Non-Static block supeb class");	
		System.out.println("");
	}
	C(){
		System.out.println("constructor of sub class ");
		System.out.println("");
	}
	void aa(){
		System.out.println("sub class method"+p+q);
	}
}
public class Blocks {

	public static void main(String[] args) {
		C obj=new C();
		obj.aa();
	}

}
