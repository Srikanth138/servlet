/*interrupted methods are used to intrrupt execution of thread thread is interrupted it is moved into IDLE State.
 * thread is interrupted to allow other threads to run.
 * 1>sleep():-is a static method of thread class. this method overloaded in thread class.
 * 2.join() 3>yield()*/
package multiThread;
class Math extends Thread{
	private int num;
	Math(int num){
		this.num=num;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(num+"*"+i+"="+(i*num));
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){e.printStackTrace();}
		}
	}
}
public class InterruptedTest4 {

	public static void main(String[] args) {
		Math t=new Math(5);
		t.start();
	}

}
