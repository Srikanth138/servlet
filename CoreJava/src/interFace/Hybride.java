/*java 8.0 allows to write a default method in interface.
 * default method is a method with body. * this method is declare with the keyword default.*/
package interFace;
interface  O{
	void m1(); //optional not raise error.
	default void m2(){
		System.out.println("this is main class");
	}
}
interface P extends O{
	void m1();
}
interface Q extends O{
	void m1();
}
class R implements P,Q{
	public void m1(){
		System.out.println("this is implemented class");
	}
}
public class Hybride {

	public static void main(String[] args) {
		R r=new R();
		r.m1();
		r.m2();
	}

}
