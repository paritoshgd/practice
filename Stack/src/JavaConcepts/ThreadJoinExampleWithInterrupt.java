package JavaConcepts;

public class ThreadJoinExampleWithInterrupt implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child Thread"+Thread.currentThread().getName() +"printing "+i);
			try {
				Thread.sleep(1000);
				continue;
			}catch(InterruptedException e) {
				System.out.println("Thread printing i value is interrupted and will be Stopped due to return");
				return;
			}
		}
	}
 
	public static void main(String[] args) {
		
		
		ThreadJoinExampleWithInterrupt t1 = new ThreadJoinExampleWithInterrupt();
		 Thread t = new Thread(t1);
		 
		 t.start();
		 try {
			 t.join(); // this will cause Main thread to join the child or created thread and wait for it to complete execution
		 }catch(InterruptedException e ) {
			 
		 }
		 System.out.println("I am main thread "+Thread.currentThread().getName());
		
	}

}
