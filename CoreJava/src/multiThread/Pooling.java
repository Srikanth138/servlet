/*Thread pool reuses previously created thread to execute current task and offers soluation to the problem of thread cycle overhead.
 * >java provide executer framework which contain Executer interface which is sub interface of Executor Service interface and the class threadpool Executor.*/
package multiThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Executors;
class Print implements Runnable{
	private String name;
	Print(String name){
		this.name=name;
	}
	public void run(){
		for(int n=1;n<=10;n++)
			System.out.println(name+" ="+n);
	}
}

public class Pooling {

	public static void main(String[] args) {
		Print p1=new Print("c1");
		Print p2=new Print("c2");
		Print p3=new Print("c3");
		ExecutorService pool=Executors.newFixedThreadPool(2);
		//Executors pools=Executors.newFixedThreadPool(2);
		pool.execute(p1);
		pool.execute(p2);
		//pools.execute(p3);
	}

}
