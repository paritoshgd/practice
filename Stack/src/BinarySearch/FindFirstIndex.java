package BinarySearch;

//program to return first index of zero in an array which has many 1 and 0 and is sorted 

public class FindFirstIndex {
	
	static int findIndex(int arr[],int key) {
		
		int mid=0;
		int start=0;
		int end= arr.length-1;
		
		while(start<=end) {
			
			mid=(start+end)/2;
			
			if(mid==0) {
				return mid;
			}
			if((arr[mid]==key && arr[mid-1]==(key+1))) {
				return mid;
			}
			if(key==arr[mid]&& arr[mid-1]==key) {
				end=mid-1;
			}
			if(key<arr[mid]) {
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
        
	       
        int[] arr = {1, 1, 1, 1,1, 0, 0, 0, 0};
        System.out.println("0 first position: "+findIndex(arr, 0));
       int[] arr1= {0,0,0};
       System.out.println("0 first position: "+findIndex(arr1, 0));
       int[] arr2= {1,1,0};
       System.out.println("0 first position: "+findIndex(arr2, 0));
    }

}
