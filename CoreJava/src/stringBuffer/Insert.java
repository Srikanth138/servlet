//insert():- this method is used to insert values into given position.
//insert(int index,primitive datatype &string);
package stringBuffer;

public class Insert {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		//sb.insert(5, "java");
		//System.out.println(sb);//compile time error
		sb.append("java");
		sb.insert(0, "oracle");
		System.out.println(sb);
		sb.insert(6, " ");
		System.out.println(sb);
	}

}
/* StringBuilder is introduced in java 5.0.
 * StringBuilder is similar to StringBuffer.
 * StringBuilder method are not synchronized it is not thread safe.
 * StringBuffer is more efficient in multi Environment*/