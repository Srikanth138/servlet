package Encapsulation;

public class Return {
	
	int main(){
		int a=10,b=20;
		return a+b; //return only one value print // return 0; is terminate (or)exist
	}

	public static void main(String[] args) {
		Return r=new Return();
		int c=r.main();
       System.out.println(c);
	}

}
