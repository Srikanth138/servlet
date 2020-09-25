/*CharArrayWriter:-thid is creater character array with default size of 32 characters.
 * CharArrayWriter caw=new CharArrayWriter(); 
 * CharArrayWriter caw=new CharArrayWriter(int size); default size 32.
 * char[] tocharArray()
 * String toString()*/
package charStream;
import java.io.*;
public class CharArray {

	public static void main(String[] args) {
		try{
	CharArrayWriter caw=new CharArrayWriter();
	caw.write('a');
	caw.write('b');
	caw.write("xyz");
	String s=caw.toString();
	System.out.println(s);
		}
		catch(Exception e){e.printStackTrace();}
	}

}
