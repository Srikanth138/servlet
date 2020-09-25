/*Character Stream used to read & write the Character data Or String.
 * Character Stream are used to perform input & Output operations on character(or)String type of data.*/
/*FileWriter:- is used writing characters with in file it allows to create text file.
 * it Allows to write data in Character(OR)String format.
 * constructer:-
FileWrite(String Filename):-this constructer create new file for writing characters.
fileWrite(String filename,boolean Append):-this constructor is used  create or append data existing file.
Methods:-
write(int value)->write one charactor inside file.
write(char ch[])->write more than one character.
write(String value)->write a string*/
package charStream;
import java.io.*;
public class FileWrite {
	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter("E:\\text1.txt");
			fw.write('a');
			fw.write("java");
			fw.write(65);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
