package JavaConcepts;

import java.util.Arrays;

public class InPlaceRemoveDuplicates {
	
	static void inplaceRemoveDuplicates(int[] arr) {
		
		//sort the array
		
		Arrays.sort(arr);
		int var= arr[0];
		for ( int i=1;i<arr.length;i++) {
			
			if(arr[i]==var) {
				arr[i]=Integer.MAX_VALUE;
			}
			else if(!(arr[i]==var)) {
				var=arr[i];
			}
		
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args ) {
		
		int arr[]= {1, 1, 2, 2, 3, 4, 5};
		inplaceRemoveDuplicates(arr);
	}
}
