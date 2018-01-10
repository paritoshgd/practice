package JavaConcepts;

import java.util.Scanner;

// Instead of finding sum in parallel the same logic can be tweaked to find the maximum in an array
public class JavaFindSumParallel {
	
	public static void main(String[] args) throws InterruptedException {
	 Scanner sc = new Scanner(System.in);     
	 System.out.println("Source ");
	 int from = sc.nextInt();
	 System.out.println("Dest");
	 int to = sc.nextInt();
	 int total=0;
	  
	 System.out.println("Number of threads ");
	 int numThreads= sc.nextInt();
	 
	 SumThread[] threads= new SumThread[numThreads];
	 	 
	 // split the work between the threads 
	 int step = (to-from)/numThreads;
	 
	 for(int i=0;i<numThreads;i++) {
		 
		 /* fill in the start/end ranges for each */
		 int start = from + (step *i);
		 int stop =  (start+step) -1;
		 /* make sure we go all the way to the end on last thread */
		 if (i==(numThreads-1)) {
			 stop=to;
		 }
		 
		 threads[i]= new SumThread(start,stop);
		 
	 }
	 
	 //run the threads
	 for(int i=0;i < numThreads;i++) {
		 threads[i].start();
	 }
	 
	 for(int i=0;i<numThreads;i++) {
		 threads[i].join();
	 }
	 
	 //calculate total sum
	 for(int i=0;i<numThreads;i++) {
		 total=threads[i].getSum()+total;
	 }
	 
	 System.out.println(total);
	 
	}
	 
	  

}


class SumThread extends Thread{
	
	int from;
	int to;
	int sum;
	
	SumThread(int from ,int to){
		this.from = from;
		this.to =to;
		sum=0;
	}
	
	public void run() {
		
		for(int i=from;i<=to;i++) {
			sum=sum+i;
		}
	}
	
	public int  getSum() {
		return sum;
	}
}