/* Aggregation is a special type of composition
 * In Aggregation 'contained' object is not created with in "container" class. but it is send to container class using method's (or) constructor's
 * in Aggregation contained object is exists independent of container object*/

package aggregation;
import java.util.*;
class A{
	int a;
	int b;
	int c;
	void set( ){
		System.out.println(a+","+b);
	}
	void get(){
		c=a+b;
		System.out.println(c);
	}
}
class B{
	Scanner sc=new Scanner(System.in);
	void set(A x){ //create reference type parameter
		System.out.println("enter numbers");
		x.a=sc.nextInt();
		x.b=sc.nextInt();
		x.set(); //line no 34
		x.get(); //line no 35
	}
}
public class Aggregation {
	public static void main(String[] args) {
		A aa=new A();
		B bb=new B();
		bb.set(aa); //pass the reference variable
		//aa.set();
		//aa.get();
	}

}
