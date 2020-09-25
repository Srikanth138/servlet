//charAt(),length(),toUpperCase(),toLowerCase(),equal(),comareTo(),compareToIgnoreCase(),concat(),replace('char','char'),replaceFirst("string,string),split(),join(),valueOf(byte/short/int/float/long),trim()
//isEmpty(),indexOf(),hashCode()
package string;
public class Methods {
	public static void main(String[] args) {
		String s="Srikanth";
		String st="SRIPATEL";
		
		for(int i=0;i<s.length();i++){ //length() of the string
		char c=s.charAt(i);//convert into characters
		System.out.println(c);
		}
		
		String s1=s.toUpperCase(); //cover upper case
		System.out.println(s1);
		
		String st1=st.toLowerCase();//convert lower case
		System.out.println(st1);
		
		boolean b=s.equals(st);//true or false
		System.out.println(b);
		
		int a=s.compareTo(st);//compare two string and return a difference
		System.out.println(a);
		
		int aa=s.compareToIgnoreCase(st);//compare two string and ignoring case and return integer value
		System.out.println(aa);
		
		System.out.println(s.concat(st));//Combined both stings
		
		System.out.println(s.replace('S','a'));//replace the character.
		
		String str="  java oracle python .net oracle  ";
		System.out.println(str.replace("oracle","mysql"));//replace the string
		
		System.out.println(str.replaceFirst("oracle","mysql"));//replace the first string only
		
		System.out.println(str.split(" ", 2));//Splits a string into an array of substrings.
		
		System.out.println(str.join(" ","cpp", "14.0"));//first one is leave next to add
		
		int n=10;
		float f=105.50f;
		System.out.println(String.valueOf((n+f)));//Returns the primitive value of a String object
	    
		System.out.println(str.trim());//Removes whitespace from both ends of a string
		
		String myStr2 = "";
		System.out.println(str.isEmpty());//Checks whether a string is empty or not
		System.out.println(myStr2.isEmpty());
		
		System.out.println(str.indexOf("oracle"));//Returns the position of the first found occurrence of specified characters in a string
		
		System.out.println(str.hashCode());//Returns the position of the first found occurrence of specified characters in a string
	}

}
