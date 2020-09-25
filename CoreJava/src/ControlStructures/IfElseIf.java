//IF-Else-IF
package ControlStructures;

public class IfElseIf {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a<b) //if(a>b)
			System.out.println("if condtion true"+a+"<"+b);
		else if(b<c) //if(b>c)
				System.out.println("if-else condition true"+b+"<"+c);
		else
			System.out.println("else statement");
		
		System.out.println("out of block every time print");
	}

} //only one condition is print if / if-else / else ->which condition is true that condition print