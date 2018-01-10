package Recursion;

public class BinaryPrint {
	
	static void printBinary(int n) {
		
		if(n < 0) {
			System.out.print("-");
			
			printBinary(-n); // here you will take the absolute value of n 
		}
		
		if(n <2) { // n==0 or n==1
			System.out.print(n);
		}else {
			
			int rem=n%2;
			n = n/2;
			printBinary(n);
			System.out.print(rem);
		}
	}
	
	public static void main(String args[]) {
		printBinary(4);
		System.out.println();
		printBinary(43);
	}

}
