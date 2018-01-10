package JavaConcepts;

public class ThreadReversePrint extends Thread{
	
	int counter;
	
	ThreadReversePrint(int counter) {
		this.counter=counter;
	}
	
	public void run() {
		
		if(counter <50) {
			createThread(counter+1);
				
		}
		System.out.println("Thread counter "+this.counter);
	}
	
	public void createThread(int val) {
		ThreadReversePrint t =new ThreadReversePrint(val);
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			
		}
	}
	public static void main(String[] args) {
		ThreadReversePrint tp =new ThreadReversePrint(1);
		tp.start();
	}
}