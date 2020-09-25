/*join is a non static method of thread class. join method is overloded inside thread class.
 * >if thread1 calls join method on thread2,thread1 execution is interrupted until execution of thread2 is completed.*/
package multiThread;
class Sum extends Thread{
	private int beg;
	private int end;
	private int sum;
	Sum(int beg,int end){
		this.beg=beg;
		this.end=end;
	}
	public void run(){
		for(int i=beg;i<=end;i++)
			sum=sum+i;
			}
		int getSum(){
			return sum;
		}
}
class SumUse extends Thread{
	public void run(){
		Sum s=new Sum(1,100);
		s.start();
		System.out.println("sum is "+s.getSum());
		try{
			s.join();
		}
		catch(InterruptedException e){
			//System.out.println("sum is "+s.getSum());
			e.printStackTrace();
		}
	}
}
public class JoinTest5 {

	public static void main(String[] args) {
	SumUse t1=new SumUse();
	t1.start();
	}
}
