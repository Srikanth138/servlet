/*runnable is a predefined interface exist in java.lang package.
 * this interface having only one abstract method ->public void run()
 * this run method define operation performed by Thread.*/
package multiThread;
class EvenNum implements Runnable{
	/*EvenNum(){
		Thread t=new Thread(this);
		t.start();
	}*/
	public void run(){
		for(int i=1;i<=10;i++){
			if((i%2)==0)
				System.out.println(i);
		}
	}
}
public class RunnableTest7 {

	public static void main(String[] args) {
		//EvenNum e=new EvenNum();
		Thread t1=new Thread(new EvenNum());
		Thread t2=new Thread(new EvenNum());
		t1.start();
		t2.start();
		
	}

}
