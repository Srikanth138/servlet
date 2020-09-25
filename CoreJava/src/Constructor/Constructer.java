/*Constructor is a special method is used to "initialize object".
 * Constructor is used to initialized non-static(or)instance variables of a class.
 * the block of code which has to be executed on creation of object is defined inside Constructor.
 * constructor is used for allocating resources to object.
 * automatic initialization is done using constructor.
 * it allows access specifiers(public,private,protected,default). but does not allows(non-access specifiers)static,final,abstract,...
 * it is called only once on object.*/
// there are two types 1.compiler defined  2.user/programmer defined ->A.parameterized  B.non-parameterized
package Constructor;
class A{
	int a=10;
	int b=20; //every class have a constructor compiler defind.
	// compiler defined "javap classname".
}

public class Constructer extends A{
	Constructer(){ // user defined constructor
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Constructer c=new Constructer();

	}

}
