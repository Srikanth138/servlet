//encapsulation is a process of binding data(grouping/wrapper)(object create) with related operations(methods).
/* OBJECT:-
* every object is having 3 character restricts
 * 1.S-> State (class) // define the 'data' of object.
 * 2.B-> Behavior (method) //define the functionality of object.
 * 3.I-> Identity(variable) // every object is Identified with unique name
 * *Object is a real world entity
 * object is an instance of class*/ 

package Encapsulation;
public class Encap {
	byte a=100; //-128 to +127 //initialization
	short b=10; //-32768 to +32767 //initialization
	int c=a+b; //(Numeric Promotion) -2147483648 to +2147483647
	int d; // Declaration
	void add(){
		System.out.println(c);
	}
	public static void main(String[] args) {
		Encap e=new Encap();
		System.out.print(e.a +"+");
		System.out.print(e.b +"=");
		e.add();
		System.out.println(e.d);
	}

}
