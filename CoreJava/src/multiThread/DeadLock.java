/*DeadLock  is a condition where two or more threads are blocked forevere, waiting for each other.*/
package multiThread;
/*
public class DeadLock {

	public static void main(String[] args) {
		String r1="java";
		String r2="python";
		Thread t1=new Thread(){
			public void run(){
				syncronized(r1){
					System.out.println("thread1 looked:r1");
					try{
						Thread.sleep(1000);
					}catch(Exception e){e.printStackTrace();}
				}
				syncronized(r2){
					System.out.println("thread1 looked:r2");
					
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				syncronized(r1){
				System.out.println("thread2 looked:r1");
				try{
					Thread.sleep(1000);
				}catch(Exception e){e.printStackTrace();}
			}
			syncronized(r2){
				System.out.println("thread2 looked:r2");
				
			}};
		}

			private void Syncronized(String r2) {
				// TODO Auto-generated method stub
				
	}

	protected static void syncronized(String r1) {
		// TODO Auto-generated method stub
		
	}
}*/
