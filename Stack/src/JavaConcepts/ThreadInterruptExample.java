package JavaConcepts;

public class ThreadInterruptExample implements Runnable {
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Printing from child thread " +i);
			
			try {
				Thread.sleep(2000);
				continue;
			}catch(InterruptedException e) {
				System.out.println("Child Thread is resuming");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadInterruptExample e1 = new ThreadInterruptExample();
		Thread t = new Thread(e1);
	    t.start();
	    
	    
	    try {
	    	
	    	System.out.println("Main Thread ");
	    	Thread.sleep(5000);
	    	t.interrupt();
	    }catch(InterruptedException e) {
	    
	    }
	}

}
