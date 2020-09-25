/* Static methods are used to define class level operations. An operation which does not required to create object.
 * Static methods access only static members(variable) of the class but can't access non-static members.
 * In order to access non-static members "with in static method we need to CREATE OBJECT".*/
package Static;

public class StaticMehtod {
	static int id=101;
	String name="sri";
	static void emp(){
		StaticMehtod sm=new StaticMehtod();//create object. by non-static
		System.out.println(id+" "+sm.name);// non-static method will calling used to reference.
	}
	public static void main(String[] args) {
		StaticMehtod.emp();
	}

}
