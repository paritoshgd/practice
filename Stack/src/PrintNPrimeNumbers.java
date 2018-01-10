
public class PrintNPrimeNumbers {
	
	
	
	public static boolean checkPrime(int num) {
		 boolean isPrime=true;
		for(int i=2; i<=(num/2);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		for (int i=2; i<=100;i++) {
			if(checkPrime(i)==true) {
				System.out.print(i+ " "
						+ "");
			}
		}
	}

}
