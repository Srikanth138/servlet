/*Serialization is process of converting "ObjectStream to ByteStream(OR)Encrypting.
 * the class must implement serializable interface. this is no methods 
 * Constructor:-ObjectOutputStream(o/pStream); > this constructor create object O/P Stream with Destination as O/p stream.
 * METHOD:-writeObect(object o); >this method is used to convert object into bytes and write inside OutputStream.*/
package ioStreams;
import java.io.*;
@SuppressWarnings("serial")
class Emp implements Serializable {
	private int empno;
	private String ename;
	private float salary;
	void setEmp(int empno,String ename,float salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		}
	void printemp(){
		System.out.println(empno+" "+ename+" "+salary);
	}
}
public class Serialization{
	
	public static void main(String[] args) {
		try{
			FileOutputStream fos=new FileOutputStream("E:\\emp.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Emp ee=new Emp();
			ee.setEmp(101, "sri", 5000.55f);
			oos.writeObject(ee);
			oos.close();
		}
		catch(IOException e){e.printStackTrace();
		}
	}

}
