//This key word(or) reference variable hold address of "current" object.
package This;
public class This {
	private int a;
	private int b;
	int x;
	This(){
		System.out.println("non parameterized constructor");
	}
	void set(int a,int b){
		this.a=a;   
		this.b=b;
		x=100;//this keyword not define program. Compiler will define compile-time.
	}
	void get(){
		System.out.println(a+" ,"+b+","+x);
		
	}
	This(int a){
		this();//constructor in side constructor call.
		System.out.println("parameterized constructor"+a);
	}
	public static void main(String[] args) {
		This t=new This();
		t.set(10,20);
		t.get();
		This t1=new This(200);
	}

}
