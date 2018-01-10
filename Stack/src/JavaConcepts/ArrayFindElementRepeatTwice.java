package JavaConcepts;

public class ArrayFindElementRepeatTwice {
	
	static void findSingleElement(int arr[]) {
		
		int singleVal=arr[0];
		
		
		
		for(int i=1; i<arr.length;i++) {
			
			if(arr[i]==singleVal) {
				singleVal=Integer.MAX_VALUE;
			}
			else if(singleVal==Integer.MAX_VALUE) {
				singleVal=arr[i];
				
			}
					
		}
		System.out.println("Element present once in the array is " +singleVal);
		
	}
	
		public static void main(String[] args) {
		
		int arr[]={1, 2, 2, 3, 3, 4, 4, 5, 5};
		
		findSingleElement(arr);

	}

	

}
