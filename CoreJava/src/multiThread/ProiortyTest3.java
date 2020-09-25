/*Thread priority is an integer value,which define the order of executing thread.
 * rang of thread is 1 to 10.
 * void setPriority(int value)
 * int getPriority().*/
package multiThread;
class NumThread extends Thread{
	public void run(){
		for(int n=1;n<=10;n++){
			System.out.println(getName()+":"+n);
			System.out.println(getPriority());
		}
	}
}
public class ProiortyTest3 {

	public static void main(String[] args) {
		NumThread t1=new NumThread();
		NumThread t2=new NumThread();
		NumThread t3=new NumThread();
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t1.setPriority(1);
		t2.start();
		t3.start();

	}

}
