package JavaConcepts;

public class ThreadExtendsThread extends Thread {
	
	public void run() {
		
		System.out.println("Running Thread");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadExtendsThread t = new ThreadExtendsThread();
		t.start();
		System.out.println("Thread state is "+t.getState());
		
	}

}
