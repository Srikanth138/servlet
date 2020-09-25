/*a variable declare class inside with static keyword is class static variable. 
 *static variables are class level variables.
 *those variables are memory is allocating at class loading time(or)compile time.
 *static variables are globle variables.
 *static variables are bind with className (and)objectName
 **static mean's allocating memory "only" compile time. ->Static changing values any time. Static is not a "CONSTANT" */
package Static;

public class Static {
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		Static s=new Static();
		Static s1=new Static();
	 System.out.println(s.x+","+y); //y is static direct accessing with in class. 
	 y=50;
	 System.out.println(s.x+","+s.y); //y is calling reference variable
	 y=100;
	 System.out.println(s.x+" "+Static.y);// y is calling class name 
	 s.y=200;
	 s1.y=400;
	 System.out.println(s.x+","+s.y);  //10,400
	 System.out.println(s.x+","+s1.y); //10,400
	}

}
