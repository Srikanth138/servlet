package ioStreams;
import java.io.*;
public class FileChar {
	public static void main(String[] args) {
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			File f=new File("e:\\text.txt");
			FileWriter fw=new FileWriter(f);
			char ch1;
			System.out.println("Enter the data:(@ at end close)");
			while((ch1=(char)br.read())!='@'){
				fw.write(ch1);
			}//end of loop
			fw.close();
			FileReader fr=new FileReader(f);
			System.out.println("==Display the data from file==");
			int ch2;
			while((ch2=fr.read())!=-1)
			{
				System.out.print((char)ch2);
			}
			fr.close();
		}catch(Exception e){e.printStackTrace();}
	}

}
