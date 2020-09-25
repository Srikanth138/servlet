/*BufferedWriter:-is used to write inside writer using buffer.
BufferedWriter(Writer capacity)->BufferedWriter object is created with default capacity.*/
package charStream;
import java.io.*;
public class BufferedWriter {

	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter("E:\\text2.txt");
			java.io.BufferedWriter bw=new java.io.BufferedWriter(fw);
			bw.write('A');
			bw.write('B');
			bw.write('C');
			bw.write('D');
			bw.write('E');
		}
		catch(IOException e){e.printStackTrace();}

	}

}
