package charStream;
import java.util.*;
import java.io.*;
public class Copy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter source filename");
		String src=sc.next();
		System.out.println("enter destination filename");
		String dest=sc.next();
		try{
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(dest);
			int x;
			while((x=fr.read())!=-1)
				fw.write((char)x);
			System.out.println("file copied .....");
			fr.close();
			fw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
