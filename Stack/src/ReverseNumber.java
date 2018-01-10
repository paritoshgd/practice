
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num=201;
		int reversenumber=0;
		
		
		while (num!=0) {
			
			reversenumber=reversenumber*10;
			reversenumber=reversenumber+num%10;
			num=num/10;
			
		}
		System.out.println(reversenumber);
	}

}
