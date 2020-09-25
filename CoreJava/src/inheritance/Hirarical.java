/* Dynamic method Dispatching:-
 * the method bind at compile time is unbind at runtime and bind with overriding method of subclass is called dynamic method dispatching(or) runtime polymorphisam.
 * ** "compiler bind method with 'reference' type. jvm calls the method object type"*/
package inheritance;
class Animal{
	void eat(){
		System.out.println("veg / non-veg");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("dog eat only non-veg");
	}
}
class Cat extends Animal{
	void eat(){
		System.out.println("cat eat only veg");
	}
}
public class Hirarical { //RunTime PolyMorphisam
	static void eatAnimal(Animal a){ 
		a.eat(); //call run time
	}
	public static void main(String[] args) {
	Dog d=new Dog();
	Cat c=new Cat();
	eatAnimal(d);
	eatAnimal(c);
	}

}
