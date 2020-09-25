//excute in NOTEPAD and CMD
package exception;
public class NFEXTest2 {

	public static void main(String[] args) {
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){ // a/0
			System.out.println("can't devided by zero");
		}
		catch(NumberFormatException n1){ //5/s
			System.out.println("give number");
			n1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException n){ //negavite values. or only give one value
			System.out.println("give a value");
		}
	}

}
