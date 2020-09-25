/*ManyForms //one operation perform different ways is called PolyMorphisam
* Defining more than One method with same name by changing parameters
* 1.number of parameters
* 2.types of parameters
* is called MethodOverloading
* method over loading with in the same class OR different class*/

package PolyMorphisam;
public class MethodOverload {
	void emp(int id,String name){
		System.out.println(id+","+name);
	}
	void emp(int id,String name,float salary){
		System.out.println(id+","+name+","+salary);
	}
	public static void main(String[] args) {
		MethodOverload mo=new MethodOverload();
		mo.emp(101, "vish");
		mo.emp(101, "vish", 5000.0f);
	}

}
