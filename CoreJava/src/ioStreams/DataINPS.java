package ioStreams;
import java.io.*;
public class DataINPS {

	public static void main(String[] args) {
		try{
			FileInputStream fis=new FileInputStream("E:\\DFile1");
		    DataInputStream dis=new DataInputStream(fis);
		    int x=dis.readInt();
		    long y=dis.readLong();
		    float z=dis.readFloat();
		    double a=dis.readDouble();
		    char b=dis.readChar();
		    String c=dis.readLine();
		   // while((x=dis.read())!=-1)
		    	System.out.println(x+", "+y+" ,"+z+" ,"+a+", "+b+" ,"+c);
		    	dis.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
