//a String is a collection of characters.those characters can be alphabets,digits(or)SpecialCharacters.
//In java String is an object.it is represented using three classes.
/*1.String:-is a predefined class.every think in java"double quote's". string is immutable string object.they can't be share.
 * whenever we are trying to modifying String object it will create new object.
 * new operator always create new string object. "double quotes if we represent String is pooled so that it can be sharable".
 * 2.StringBufferL:-
 * 3.stringBuilder:-*/
package string;

public class StringTest1 {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		boolean b=s1==s2;
		System.out.println(b);
	}

}
