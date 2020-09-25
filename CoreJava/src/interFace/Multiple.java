package interFace;
interface X{
	final static int x=10;
	void m1();
}
interface Y{
	final static int y=20;
	void m1();
}
class C implements X,Y{
	public void m1(){
		System.out.println("implements two interfaces"+x+y);	
	}
}
public class Multiple {

	public static void main(String[] args) {
		C c=new C();
		c.m1();
	}

}
