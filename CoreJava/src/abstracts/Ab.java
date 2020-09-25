package abstracts;
class CLS{
	protected int i=99;
}
public class Ab {
	private int i=1;
	public static void main(String[] args) {
		Ab a=new Ab();
		a.hallow();

	}
	//abstract void hallow()  Error:- class inside abstract method not define. only abstact class is define abstract method
	void hallow()
	{
		System.out.println("Claines"+i);
	
	}

}
/* abstract class cls-name{
  abstract void method(); // abstract method is not implements abstract class
void hallow(){ } //concrete means method with body
*/