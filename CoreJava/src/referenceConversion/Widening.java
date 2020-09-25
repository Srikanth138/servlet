//Implicit conversion:- this is compiler do by the work.
//when super-class reference hold sub-class object, it call only methods of super class inherited in sub-class.
package referenceConversion;
class Manager{
	void m1(){
		System.out.println("m1 method of manager");
	}
	void m2(){
		System.out.println("m2 method of manager");
	}
}
class SalesManager extends Manager{
	void m1(){
		System.out.println("m1 method of salesmanager");
	}
	void m3(){
		System.out.println("m3 method of salesmanager");
	}
}
public class Widening {
	public static void main(String[] args) {
		SalesManager sm=new SalesManager();
		sm.m1();//overriding 
		sm.m2();//manager class
		sm.m3();//overriding
	Manager m=sm;
	m.m1();
	m.m2();
	}

}
