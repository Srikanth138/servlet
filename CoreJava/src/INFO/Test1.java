package INFO;
import java.io.*;
public class Test1 {
	public static void main(String args[])throws Exception
	{
		PrintStream out=new PrintStream("con");// object creation
		out.println("java");//calling method with "out" reference variable.
		out.println(100);
		PrintStream x=new PrintStream("con");
		x.println("java");
		
		x.close();
		out.close();
	}

}
//static Method's& Variable's are bind with class name
//method's are called with reference variable.