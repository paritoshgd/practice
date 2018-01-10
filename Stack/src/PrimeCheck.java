import java.util.Scanner;

public class PrimeCheck {
	
	public static void main(String[] args) {
		
		int temp;
		int num;
		boolean isPrime=true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			
			if(num%i==0) {
				isPrime=false;
				break;				
			}		
				
		}
		if(isPrime) {
			System.out.println("Number "+ num +"is prime");
		}
		else {
			
			System.out.println("Number "+ num +"is not  prime");
		}
		
		
	}

}
