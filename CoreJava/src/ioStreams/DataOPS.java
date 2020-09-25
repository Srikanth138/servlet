/*Dataoutput stream to write primitive data.(byte,short,int,long,float,double,boolean) into o/p Stream.
->DataOutputStream convert primitive data into sequance of byte & write into O/P Stream.*/
package ioStreams;
import java.io.*;
public class DataOPS {

	public static void main(String[] args) {
	 try{
		 FileOutputStream fos=new FileOutputStream("E:\\DFile1");
		 DataOutputStream dos=new DataOutputStream(fos);
		 dos.writeInt(100);
		 dos.writeLong(5000L);//fos.write(5000L); is give a error. 
		 dos.writeFloat(1.52f);
		 dos.writeDouble(23.54);
		 dos.writeBoolean(true);
		 dos.writeChar('c');//char
		 dos.writeChars("string");//String
		 dos.close();
	 }
	 catch(IOException e){
		 e.printStackTrace();
	 }
	}

}
