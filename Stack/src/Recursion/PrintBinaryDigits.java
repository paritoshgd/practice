package Recursion;

public class PrintBinaryDigits {
	
	//program to print bianry numbers based on number of digits sepcified
	static void printDigits(int digits ,String prefix) {
		System.out.println("printDigits("+prefix+")"+digits);
		;
		if(digits==0) {
			
			System.out.println(prefix);
			
		}else {
			
			printDigits(digits-1, prefix+"0");
			printDigits(digits-1,prefix+"1");
		}
	}
	
	public static void main(String[] args) {
		
		printDigits(2,"");
	}

}
