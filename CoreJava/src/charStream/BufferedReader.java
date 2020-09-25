/*BufferedReader(Reader)->with address of Reader object.
 * BufferedReader(Reader,int capacity)-> with given capacity.
 * read() >read one character.
 * readLine() > read oneLine and return String Object.*/
package charStream;
import java.io.*;
public class BufferedReader {

	public BufferedReader(FileReader fr, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("E:\\text2.txt");
			BufferedReader br=new BufferedReader(fr,5);
			int x;
			while((x=br.read())!=-1)
				System.out.println((char)x);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

}
