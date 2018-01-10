package JavaConcepts;

public class IncCounterMultiThread {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		// make a set of template increment threads
		IncrementThread [] threads = new IncrementThread[100];
		//set the counter and the increment 
		for(int i=0;i<100;i++) {
			threads[i]=new IncrementThread(counter, 5);
		}
		//start the threads
		for(int i=0;i<100;i++) {
			threads[i].start();
		}
		
		//wait for threads to terminate
		for(int i=0;i<100;i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Counter value is "+counter.getval());
		System.out.println("Actual counter value per number of increments is 500 as it is 5*100");
	}

}

class Counter{
	
	private int val;
	 public Counter() {
		 val=0;
	 }
	 
	public synchronized void increment() {		
		val=val+1;		
	}
	
	public int  getval() {
		return val;
	}
}

class IncrementThread extends Thread{
	
	public IncrementThread(Counter counter,int amount) {
		
		this.counter=counter;
		this.amount=amount;
	}
	public void run() {
		for(int i=0;i<amount;i++) {
			
			this.counter.increment();
		}
		
	}
	
	Counter counter; 
	int amount;
}