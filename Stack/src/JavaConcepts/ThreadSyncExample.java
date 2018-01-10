package JavaConcepts;

public class ThreadSyncExample {
	
     static volatile int counter =0;
     static Object object = new Object();
     
     public static void main(String[] args) {
    	 
    	 Thread even = new Thread(new EvenGenerator(),"evenThread");
    	 Thread odd = new Thread(new OddGenerator(),"oddThread");
    	 even.start();
    	 odd.start();
      }
     
     static class EvenGenerator implements Runnable{
    	 
    	 public void run() {
    		
    		 synchronized(object) {
    			while(true) { 
    			 if(counter%2==0) {
    				 System.out.println(Thread.currentThread().getName()+ " "+counter);
    				 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				 counter++;
    				 object.notify();
    			 } 
    			 else {
    				 try {
    					 	object.wait();
    				 }catch(InterruptedException e ) {
    					 e.printStackTrace();
    				 }
    			 }
    			 
    		 }
    	 }
     }
     }
     
     static class OddGenerator implements Runnable{
    	 
    	 public void run() {
    		 
    		 synchronized(object) {
    		 
    			while(true) {
    			  if(counter%2==1) {
    				  System.out.println(Thread.currentThread().getName()+ " "+counter);
    				  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				  counter++;
    				  object.notify();
    			  }
    			  else {
    				  try {
    					  object.wait();
    				  }catch(InterruptedException e) {
    					  e.printStackTrace();
    				  }
    			  }
    		 }
    	 }
     }
     }
    

}
