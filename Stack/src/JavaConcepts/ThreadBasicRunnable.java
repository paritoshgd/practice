package JavaConcepts;

// Here we are not extending Thread class . We are implements Runnable so we need to create Thread class Object explicity 
public class ThreadBasicRunnable implements Runnable {
	
	public void run() {
		
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		
		ThreadBasicRunnable tb= new ThreadBasicRunnable();
		Thread t = new Thread(tb);
		t.start();
	}
	

}
