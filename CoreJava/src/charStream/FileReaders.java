/*FileReader:-the datawhich is written using file writter is read using fileReader.
		*FileReader is used to read data from existing taxtfile.
		Constructor:-
		FileReader(Steing file):-this constructor create fileReader object with given file name.
		method:-
		>int read():-this read one character from file and return character as integer type.return type is integer be cause end file value is represent as -1.
		>int read(char ch[]):-read more than one character. */
package charStream;
import java.io.*;
public class FileReaders {
public static void main(String args[]){
		try{
			FileReader fr=new FileReader("E:\\text1.txt");
			int x;
			while((x=fr.read())!=-1)
				System.out.println((char)x);
			fr.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
