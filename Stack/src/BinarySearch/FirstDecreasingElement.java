package BinarySearch;

public class FirstDecreasingElement {

	static int findElement(int arr[]) {
		
		int mid=0;
		int start = 0;
		int end = arr.length-1;
		System.out.println("Array size is "+arr.length);
		while(start<=end) {
			
			mid=(start+end)/2;
			
			
			if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) {
				return mid;
			}
			
			if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
				end=mid-1;
			}
			else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
				start=mid+1;
			}
			
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] arrA = {1,2,4,6,11,15,19,20,21,31,41,51,55,46,35,24,18,14,13,12,11,4,2,1};
        int index = findElement(arrA);
        System.out.println("(Binary Search) First Element from where elements starts decreasing: (index: "+index+") : " + arrA[index]);
        int [] arrA1 = {1,2,4,6,11,15,19,20,21,31,41,51,55,46,35,24,18,14,13,12,11,4,2,1,0,-1,-2};
        index=findElement(arrA1);
        System.out.println("(Binary Search) First Element from where elements starts decreasing: (index: "+index+") : " + arrA1[index]);
        
        
	}
}
