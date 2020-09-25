/*Synchronization is a process of acquring the lock of object.
 * when more than one thread is doing one operation not allowing another thread to perform operation is called synchronization.
 * Synchronization avoid  "Logical Error's".
 * a thread acqure lock of the object by calling synchronization method.
 * Ex:-BUS Tickets booking.*/
package multiThread;
class Bus{
	private int seats=30;
	synchronized void reserve(String name,int n){ //Synchronization avoid  "Logical Error's"
		if(n<seats){
			for(int i=1;i<=n;i++)
				seats=seats-1;
			System.out.println("hello "+name.toUpperCase()+" seats are reserved");
			System.out.println("available seats "+seats);
		}
		else
			System.out.println("seatsare not Available");
	}
}
class ReserveThread extends Thread{
	Bus b;
	String name;
	int n;
	ReserveThread(Bus b,String name,int n){
		this.b=b;
		this.name=name;
		this.n=n;
	}
	public void run(){
		b.reserve(name, n);
	}
}
public class SynchronizationTest6 {

	public static void main(String[] args) {
		Bus hyd=new Bus();
		ReserveThread r1=new ReserveThread(hyd,"sri",5);
		ReserveThread r2=new ReserveThread(hyd,"patel",10);
		r1.start();
		r2.start();

	}

}
