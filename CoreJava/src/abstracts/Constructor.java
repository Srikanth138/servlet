package abstracts;
abstract class C{
	private int x,y;
	C(int x,int y){
		this.x=x;
		this.y=y;
	}
	void printxy(){
		System.out.println(x+" "+y);
	}
}
class B extends C{
	private int p,q;
	B(int x,int y,int p,int q){
		super(x,y); //constructor is not call error raise
		this.p=p;
		this.q=q;
	}
	void printpq(){
		System.out.println(p+" "+q);
	}
}
public class Constructor {
	public static void main(String[] args) {
	B b=new B(10,20,30,40);
	b.printpq();
	b.printxy();
	}

}
