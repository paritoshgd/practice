package JavaConcepts;


public class EvenOddPrintThreads{
	 
	public static volatile int counter;
	public static void main(String[] args) throws Exception {
		
		Thread even = new Thread(new EvenGenerator(),"EvenThread");
		Thread odd =new Thread (new OddGenerator(),"OddThread");
		even.start();
		odd.start();
		while(counter<20) {
			counter++;
			even.interrupt();
			odd.interrupt();
			Thread.sleep(1000L);			
		}
		System.out.println("In Main");
		
	}
	
	private static class EvenGenerator implements Runnable{
		
		public void run() {
			
			int oldNum=0;
			while(true) {				
			try {
				Thread.sleep(Long.MAX_VALUE);
			}
			catch(InterruptedException e ) {
				
			}
			int num =counter;
			if(num!=oldNum && num%2 ==0) {
				System.out.println(Thread.currentThread().getName() + " " + num);
				oldNum=num;
			}
			
		}
		}
	}
	
	private static class OddGenerator implements Runnable{
		
		public void run() {
			
			int oldNum=0;
			while(true) {
			try {
				Thread.sleep(Long.MAX_VALUE);
			}catch(InterruptedException e) {
				
			}
			int num=counter;
			if(num!=oldNum && num%2==1) {
				System.out.println(Thread.currentThread().getName() + " " + num);
				oldNum=num;
			}
		}
		}
	}
}



