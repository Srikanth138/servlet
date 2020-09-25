/*Inheritance is a process where one class acquires the properties and behavior of another. 
 *inheritance is super-class derived from the  sub-class */

/*Generalized class it is class which is developed based on commonality,super class is called Generalized class.
 *SINGLE-LEVEL CLASS IS ONE CLASS IN SIDE ON OTHER CLASS
 *ONE CLASS EXTENDS ANOTHER CLASS WE USE EXTENDS KEYWORD.*/

package inheritance;
class A{
	int a=10;
	void aa(){
		System.out.println("this is super class "+a);
	}
}
class B extends A{
	int b=20;
	void add(){
		int c=a+b;
		System.out.println("this is child class :"+c);
	}
}
public class SingleLevel {

	public static void main(String[] args) {
		B obj=new B();
		obj.aa();
		obj.add();
	}

}
