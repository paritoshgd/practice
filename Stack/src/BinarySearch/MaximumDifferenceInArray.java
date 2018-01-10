package BinarySearch;

public class MaximumDifferenceInArray {
	
	static void finMaxDiffArray(int[] arr) {
		
		int maxElementSoFar=arr[arr.length-1];
		int maxDifference=-1;
		int tempDifference=0;
		
		for(int i =arr.length -2; i>0;i--) {
			
			if(maxElementSoFar < arr[i])
				maxElementSoFar = arr[i];
			
			if(maxElementSoFar > arr[i]) {
				
				 if(maxDifference < (maxElementSoFar-arr[i]))
					 maxDifference=maxElementSoFar-arr[i];
				
			}
		}
		System.out.println("Maximum Difference in array is "+maxDifference);
		
		
	}
	public static void main(String[] args) {
		int [] A = { 12, 5, 1, 7, 3, 9, 5};
		finMaxDiffArray(A);
        //System.out.println("Maximum Difference between two elements A[i] and A[j] and where j > i: " + finMaxDiffArray(A));
	}

}
