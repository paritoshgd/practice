package JavaConcepts;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Random num = new Random();
		
		//Generate random numbers with 0 inclusive and 10 exclusive . This is done using nextInt(int n) function
		for(int i=0;i<=10;i++) {
			
			//System.out.println(num.nextInt(10));
			
		}
		
		//Generate random numbers between 1 inclusive and 10  .
		// You want to generate random numbers "from" a particular value . So add from to each generated value 
		int from =1;
		int  to=10;
		for (int i=0;i<=20;i++) {
			
			int no= num.nextInt((to-from+1))+from;
			//stem.out.println(no);
		}
		
		//for Java 1.7 and later use ThreadLocalRandom.current.nextInt(min,max) to generate values in a ran=ge
		   for (int i=0;i<=30;i++) {
			
			int no= ThreadLocalRandom.current().nextInt(from,to+1);
			System.out.println(no);
		}
		 
		
	}

}
