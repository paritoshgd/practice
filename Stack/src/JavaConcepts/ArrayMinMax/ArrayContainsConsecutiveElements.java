package JavaConcepts.ArrayMinMax;

public class ArrayContainsConsecutiveElements {
	
	static void checkConsecutiveElements(int[] arr) {
		
		
		int n= arr.length;
		int firstTerm=Integer.MAX_VALUE;
		
		for(int i=0; i <arr.length;i++) {
			if(firstTerm > arr[i]) {
				firstTerm= arr[i];
			}
		}
		//calculate sum for consecutive element is  ( n *(2*a(n-1)*d))/2
		//d = 1  as elements need to be consecutive
		
		int apSum=  (n * (2 * firstTerm+(n-1)*1))/2;
		
		//calculate consecutive sum 
		int sum=0;
		for(int i=0 ;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		if(sum==apSum) {
			System.out.println("There are consecutive elements in array ");
		}
		else {
			System.out.println("There are no consecutive elements in the array");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = { 2, 1, 0, -3, -1, -2 };
		checkConsecutiveElements(arr);
	}

}
