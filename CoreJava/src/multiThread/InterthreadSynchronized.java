/*Interthread communication is machanisam in thead is paused runing in its critical section and anothe tread is allowed to enter in to the same section to be executed.
 * 1>wait():
 * 2>notify():
 * 3>notifyAll():*/
package multiThread;
class Buffer{
	private int n;
	private boolean flag;
	synchronized void put(int n)throws Exception{
	if(flag==true)
		wait();
	this.n=n;
	flag=true;
	notify();
	}
	synchronized int get()throws Exception{
		if(flag==false)
			wait();
		flag=false;
		notify();
		return n;
		}
}
class PutThread extends Thread{
	Buffer b;
	PutThread(Buffer b){
		this.b=b;
	}
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				b.put(i);
			System.out.println(i);//own
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class GetThread extends Thread{
	Buffer b;
	GetThread(Buffer b){
		this.b=b;
	}
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				int n=b.get();
			System.out.println(n);
		}}catch(Exception e){
			e.printStackTrace();
		}
	} 
}
public class InterthreadSynchronized {

	public static void main(String[] args) {
		Buffer b=new Buffer();
		PutThread pt=new PutThread(b);
		GetThread gt=new GetThread(b);
		pt.start();
        gt.start();
	}

}
