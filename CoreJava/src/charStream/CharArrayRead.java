/**/
package charStream;
import java.io.*;
public class CharArrayRead {

	public static void main(String[] args) {
		char ch[]={'a','b','c','d','e'};
		try{
			CharArrayReader car=new CharArrayReader(ch);
			char c[]=new char[2];
			car.read(c);
			String s=new String(c);
			System.out.println(s);
		}
		catch(IOException e){e.printStackTrace();}

	}

}
