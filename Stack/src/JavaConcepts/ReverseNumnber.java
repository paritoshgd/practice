package JavaConcepts;

import java.util.Scanner;

public class ReverseNumnber {
	
	public static void main(String[] args ) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number to be reveresed");
		int number = in.nextInt();
		int reverse=0;
		while(number !=0) {
			  reverse = reverse *10;	
			  reverse = reverse + number%10;
			  number=number/10;
		}
		System.out.println("reversed number "+ reverse);
	}

}
