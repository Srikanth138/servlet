/*demanthread is a low priorty thread that runs in background to perform task such as garbage collection.(excution complete object is destroi).
 * setDaemon(boolean value) ->if value true, if change user thread to daemon thread.*/
package multiThread;
class NumTh extends Thread{
public void run(){
	for(int i=1;i<=10;i++)
		System.out.println("i="+i);
}
}
public class DeamonthreadTest8 {

	public static void main(String[] args) {
		NumTh t=new NumTh();
		t.setDaemon(true);
		t.start();
		for(int j=1;j<=10;j++)
			System.out.println("j="+j);
	}

}
