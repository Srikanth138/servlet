package Constructor;
public class Nonparameter {
	Nonparameter(){
		System.out.println("non parameterized constructor");
	}
	Nonparameter(int a){
		System.out.println("parameterized constructor"+a);
	}
	public static void main(String[] args) {
		Nonparameter n=new Nonparameter();
		Nonparameter np=new Nonparameter(10);
	}

}
