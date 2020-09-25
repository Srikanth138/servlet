package exception;
class M{
	void m1(){
		System.out.println("null pointer exception");	
	}
}
public class NULEXTest3 {
	public static void main(String[] args) {
		try{
			M m=null;
			m.m1();
		}
		catch(NullPointerException e){
			System.out.println("there is no error");
		}

	}

}
