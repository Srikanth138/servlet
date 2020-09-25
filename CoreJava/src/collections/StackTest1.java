/*Stack is a subtype vector.
 * stack is a list,which follows LIFO(LastInFirstOut).
 * the element inserted last is removed first.
 * the stack is introduced in java1.0.
 * stack is providing the following operations
 * 1>push():- adding element into stack.
 * 2>pop():- removing elements from stack.
 * 3>peek()-> overflow or not.
 * 4>display()
 * 5>exit()*/
package collections;
import java.util.*;
public class StackTest1 {
	static int opt;
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("**Stack operations**");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.display");
			System.out.println("5.Exit");
			System.out.println("Enter your option");
			opt=sc.nextInt();
			switch(opt){
			case 1:
				System.out.println("enter the element to push");
				int e=sc.nextInt();
				st.push(e);
				System.out.println("element pushed");
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("stack is empty");
				else
					System.out.println("elemnet is poped is"+st.pop());
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("empty");
				else
					System.out.println("Element is "+st.peek());
				break;
			case 4:
				if(st.isEmpty())
					System.out.println("stack is empty");
				else
					System.out.println(st);
			}
		}
		while(opt!=5);
	}

}
