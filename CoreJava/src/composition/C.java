//(has-a relation) Engine has a car.
//composition is a process of creating an object of one class inside another class.
//Container class create reference variable of contained class.

package composition; 
class A{ //Contained class
	int x=10;
	void m(){
	System.out.println("contained class1 ");
	}
}
class B{ //Container class
	int y=20;
	A a=new A();
	void mm(){
	System.out.println("contained class2: "+a.x);
	}
}
public class C { //Container class
	public static void main(String[] args) {
		B b=new B();
		b.a.m();
		b.mm();
		System.out.println("container class "+b.a.x);
		System.out.println("container class "+b.y);
	}

}
