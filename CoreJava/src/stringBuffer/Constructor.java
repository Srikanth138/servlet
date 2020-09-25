/*StringBuffer represents mutable String.
 * StringBuffer provide methods for "Adding,updating and deleting"  character from String.
 * methods of StringBuffer are Synchronized(thread safe).
 * StringBuffer(capacity):-This constructor create StringBuffer object with the capacity of "16character".
 * the capacity of this StringBuffer increase automatically when it is full. capacity increment it double the capacity.
 * StringBuffer(int Capacity):-This constructor create object with give capacity.
 * StringBuffer(String str):-this constructor create StringBuffer with existing String Object.*/
package stringBuffer;

public class Constructor {
   public static void main(String[] args) {
	   StringBuffer sb=new StringBuffer();//16
	   System.out.println(sb);//0
	   System.out.println(sb.capacity());//16 //return the capacity of StringBuffer.
	   System.out.println(sb.length());//0 //return count of characters.
	   
	   StringBuffer sb1=new StringBuffer(5);
	   System.out.println(sb1.capacity());//5
	   System.out.println(sb1.length());//0
	   sb1.append("java");
	   sb1.append("14");
	   System.out.println(sb1.capacity());//12
	   System.out.println(sb1.length());//6
	   sb1.append(true);
	   sb1.append("5.0");
	   sb1.append("100");
	   sb1.append('A');
	   System.out.println(sb1);
	}

}
