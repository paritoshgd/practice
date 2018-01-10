package JavaConcepts;
import java.util.Scanner;

public class SwapWithoutTemp {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//a =10 b =15
		
		/*
		 *  b=a ;  b= 10 ,a=10
		 *  a=a+b   10+15 =25
		 *  b=a-b    25 -15 =10 
		 *  a = a-b  25 -10 =15
		 * 
		 */
		int a = in.nextInt();  
		int b = in.nextInt();
		a =a+b;
		b=a-b;
		a=a-b;
		System.out.println ("a "+a);
		System.out.println ("b "+b);
		
		
	}

}
