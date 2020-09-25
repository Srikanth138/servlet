package inheritance;
class Alpha{
	int a=10;
	void aa(){
	System.out.println("super class of Alpha"+a);
	}
}
class Beta extends Alpha{
	int b=20;
	Beta(){
		super();
	}
	void add(){
		System.out.println("sub-class of Beta: "+(a+b));
	}
}
class Gama extends Beta{
	int c=30;
	void sub(){
		System.out.println("sub-class of Game: "+(a-(b-c)));
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Gama obj=new Gama();
		obj.aa();
		obj.add();
		obj.sub();
	}

}
