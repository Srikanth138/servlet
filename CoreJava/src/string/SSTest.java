package string;
// string use concat() method
//SringBuffer use append() method
public class SSTest {
	
	public static void main(String[] args) {
		String st1="name";
		String st2="how";
		String st3="im";
		String sc1=st1.concat(st2);
		String sc2=st2.concat(st3);
		String s1=new String("sri");
		String s2=new String("kanth");
		String s3=new String("patel");
		String str1=s1.concat(s2);
		String str2=str1.concat(s3);
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuffer sb1=new StringBuffer("sri");
		StringBuffer sb2=new StringBuffer("kanth");
		StringBuffer stb1=sb1.append(sb2);
		System.out.println(stb1);
	}

}
