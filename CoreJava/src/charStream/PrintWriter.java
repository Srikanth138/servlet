/*PrintWriter:- ios used to write primitive data as String .
 * print writer use writer to write data.
 * PrintWriter(writer):-object is created withAddress of writer.
 * PrintWriter provide priont,println & printf method to write primitive data.
 * >FileWriter fw=new FileWriter("e:\\text.txt");
 * >PrintWriter pw =new PrintWriter(fw);*/
package charStream;
import java.io.*;
public class PrintWriter {

	public PrintWriter(FileWriter fw) {
	
	}

	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter("e:\\text3.txt");
			PrintWriter pw =new PrintWriter(fw);	
			pw.println("100L");
			pw.println("10.5f");
			pw.println("java");
			pw.println("true");
			fw.close();
		}
		catch(Exception e){e.printStackTrace();}

	}

	private void println(String string) {
	
		
	}

}
