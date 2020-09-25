//A class define inside with in the method (or) block is called local class.
//local class can access members of outer class directly.
package innerclass;
class L1{
	int a=10;
	void l1(){
		int b=20;
		System.out.println(" wait a,b values"+a+b);
		class L2{
			int c=30;
			void l2(){
				System.out.println(" inside L2 class and inside l2 method c,b,a"+c+b+a);
			}
		}
		L2 ll1=new L2();//with in the method create the class be causes create object and call inside class method only here.
		ll1.l2();
	}
	void l3(){
		System.out.println(" outside all");
	}
}
public class LocalClass {

	public static void main(String[] args) {
		L1 ll2=new L1();
		ll2.l1();
		ll2.l3();
	}

}
