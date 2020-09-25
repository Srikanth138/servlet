package ioStreams;
import java.io.*;
public class FileIPS {

	public static void main(String[] args) {
		try{
		FileInputStream fis=new FileInputStream("E:\\file1");
		int x;
		while((x=fis.read())!=-1) //(x=10)!=-1
			System.out.println(x);
			fis.close();
		}
		catch(IOException e){e.printStackTrace();
			
		}
	}

}
