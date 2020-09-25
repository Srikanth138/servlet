package composition;
class Many{
	int a=10;
	int b=20;
	int c=a+b;
	int d=a*b;
}
class One{
	Many m=new Many();
	Many m1=new Many();
	void get(){
	System.out.println(m.c);
	System.out.println(m1.d);
	}
}
public class ManyToOne {
    One o=new One();
	public static void main(String[] args) {
		ManyToOne mn=new ManyToOne();
		mn.o.get();
		
	}

}
