package BinarySearch;

public class BinSearch {
	
	static int binSearch(int[] arr,int key) {
		
		
		int start = 0;
		int end =arr.length-1;
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]==key && arr[mid-1]==(key+1) && arr[mid+1]==key) {
				return mid;
			}
			if (key<arr[mid]) {
				end=mid-1;
			}
			else  {
				start=mid+1;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
        
       
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+binSearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+binSearch(arr1, 432));
    }

}
