package ioStreams;
import java.io.*;
class Alpha implements Serializable{
	int x=65;
	int y=66;
	transient int z=67; //once we declare variable as transient, this variable is not write inside Stream.
}
public class TransientKey {

	public static void main(String[] args) {
		try{
			FileOutputStream fos=new FileOutputStream("E:\\transiant.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Alpha a=new Alpha();
		    oos.writeObject(a);
		    oos.close();
		    
		    FileInputStream fis=new FileInputStream("E:\\transiant.ser");
		    ObjectInputStream ois=new ObjectInputStream(fis);
		    Alpha aa=(Alpha)ois.readObject();
		    System.out.println(aa.x);
		    System.out.println(aa.y);
		    System.out.println(aa.z);
		    ois.close();
		}
		catch(Exception e){e.printStackTrace();}
	}

}
