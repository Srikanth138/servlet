package enums;
public class DisEnum {
	public static void main(String[] args) {
		System.out.println("===Display from Enum==");
		for(Cars c:Cars.values()){
			System.out.println(c+" Costs "+c.getPrice()+" Thosand Dollars");
		}//end of the loop
	}

}
