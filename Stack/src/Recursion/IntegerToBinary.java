package Recursion;

public class IntegerToBinary {
	
	static void computeBinary(int num) {
		
		if(num >0)
		{
			computeBinary(num/2);
			System.out.print(num%2);
		}
	}

	public static void main(String[] args) {
		computeBinary(4);
	}
}
