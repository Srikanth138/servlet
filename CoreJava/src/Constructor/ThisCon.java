package Constructor;

public class ThisCon {
	ThisCon(){
		//this("sss"); //constructor call should not be "recursive". 
		System.out.println("non parameter Construcor");
	}
	ThisCon(String name){ //this constructor call must be first statement with in constructor.
		this(); // this constructor call is used with in constructor but not inside method.
		System.out.println("parameterized");
	}
	public static void main(String[] args) {
		ThisCon ts=new ThisCon("sri");
    }
}
//a constructor calls only one constructor of same class but can't call more than one constructor.