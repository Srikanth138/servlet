package ioStreams;
import java.io.*;
public class FileOPS {

	public static void main(String[] args) {
		try{
			FileOutputStream fos=new FileOutputStream("E:\\file1");
			fos.write(65); //A
			fos.write(66); //B
			fos.write(67); //C
			fos.write(68); //D
			byte b[]={69,70,71,72};
			fos.write(b);
			fos.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
