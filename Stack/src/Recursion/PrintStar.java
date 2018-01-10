package Recursion;

public class PrintStar {
	
	static void printStar(int n) {
		
		if (n > 0) {
			System.out.print("*");
			printStar(n-1);
		}	
	}

	 public static void main(String[] args) {
		 
		 printStar(3);
		 System.out.println();
		 printStar(4);
	 }
}
