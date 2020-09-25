/*Deserialization is process of converting "Byte Stream to Objectstream.
 * Deseriablization id process of reading (or) getting existing state of the object(or) decrypting.
 * ObjectInputStream:-is used for reading object from o/p stream(byte stream).
 * Constructor:-ObjectInputStream(Input Stream); >create object in stream.
 * method:-object readObject(); >this method reconstruct object of type and return the object address as superType(object).*/
package ioStreams;
import java.io.*;
public class Deserialization {

	public static void main(String[] args) {
		try{
			FileInputStream fis=new FileInputStream("E:\\emp.ser"); 
			ObjectInputStream ois=new ObjectInputStream(fis);
			Emp e=(Emp)ois.readObject();
			e.printemp();
			ois.close();
		}
		catch(Exception a){a.printStackTrace();} //ioException not support.
	}

}
