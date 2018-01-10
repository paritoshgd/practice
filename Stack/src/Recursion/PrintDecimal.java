package Recursion;

//program to print decimal numbers based on number of digits sepcified
public class PrintDecimal {
	
	static void printdecimals(int digits,String prefix) {
		
		if(digits==0) {
			System.out.println(prefix);
		}else {
			
			for(int i=0;i<10;i++) {
				printdecimals(digits-1, prefix+i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		printdecimals(3,"");
		
	}

}
