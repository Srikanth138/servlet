/*final is a keyword and this keyword is used for declaring variables,methods and classes.
 * FINAL VARIABLES are constants whose values are never changed.
 * final variables are must be initialize.
 * once variable is create with initialize that value can't modified.*/
package finals;
class First{
	private final int accno=101; //final variables are must be initialize.
	private String name;
	private float balance;
	private static float MIN_BALANCE;
	static{
		MIN_BALANCE=5000f; 
	}
		void setAccount(String name,float balance){
			this.name=name;
			this.balance=balance;
		}
		void deposit(float tamt){
			balance=balance+tamt;
		}
		void withdraw(float tamt){
			if((balance - tamt)<MIN_BALANCE)
				System.out.println("insuff balance");
			else 
				balance=balance - tamt;
		}
		void printAccount(){
			System.out.println(accno+" "+name+" "+balance);
		}
}
public class Account {

	public static void main(String[] args) {
		First ff=new First();
		ff.setAccount("Srikanth", 10000f);
		ff.printAccount();
		ff.deposit(7000f);
		ff.printAccount();
		ff.withdraw(2000f);
		ff.printAccount();
	}

}