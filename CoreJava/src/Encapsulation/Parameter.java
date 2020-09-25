package Encapsulation;

public class Parameter {
	private int rollno;
	private String name;
	void set(int r,String n){
		rollno=r;
		name=n;
	}
	void get(){
		System.out.println(rollno+","+name);
	}

	public static void main(String[] args) {
		Parameter p=new Parameter();
		p.set(101, "srikanth");
		p.get();

	}

}
