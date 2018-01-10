package JavaConcepts;

import java.util.Arrays;

public class SepZeroAnd1 {
	
	static void separateZeroAndOne(int[] arr) {
		
		int left =0;
		int right = arr.length-1;
		
		while(left<right) {
			
			if(arr[left]==0) {
				left++;
			}
			if(arr[right]==1) {
				right--;
			}
			else {
				int temp= arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
   
	public static void main(String[] args) {
		 int [] arrA = {1,0,1,0,1,1,0,1};
	        System.out.println("Rearranging arrays using left and right indexes");
	         separateZeroAndOne(arrA);
	}
}
