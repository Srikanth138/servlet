/* Redefining of super class non-static method with in subclass is called method overriding.
 * Defining non-static method with in subclass with same name & same parameters and return type of method exists in super class is called method overriding.
 * */
package PolyMorphisam;
class Parent{
	void eat(){
		System.out.println("Animal class");
	}
}
class Child extends Parent{
	void eat(){
		System.out.println("dog eats non-veg");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		//Parent obj=new Parent();
		//obj.eat();
		Child obj1=new Child();
		obj1.eat();

	}

}
