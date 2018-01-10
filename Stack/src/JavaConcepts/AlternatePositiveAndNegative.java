package JavaConcepts;

import java.util.Arrays;

public class AlternatePositiveAndNegative {
	
	static void alternatePositiveNegative(int[] arr) {
		
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
				int left=1;
				int right=0;
				int  high=0;
				
				//count the number of negative integers
				while(arr[high]<0)
					high++;
				
				// the index of the first positive integer 
				right=high;
				
				while(arr[left]<0 && right<arr.length) {
					
					int temp = arr[right];
					arr[right]=arr[left];
					arr[left]=temp;
					left =left +2; // you can increment this by 2 as you need alternate postive and negative
					right++;
					
				}
			   
			    
			    
			    System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String [] args) {
		
		int[] arrA = { 1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14 };
		alternatePositiveNegative(arrA);
	}

}
