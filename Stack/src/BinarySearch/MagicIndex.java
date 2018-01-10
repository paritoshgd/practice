package BinarySearch;

//explaination for magic Index http://algorithms.tutorialhorizon.com/magic-index-find-index-in-sorted-array-such-that-ai-i/
public class MagicIndex {
	
	static void binSearchMagicIndex(int start,int end,int[] arr) {
		
		 int mid = (start+end)/2;
		 
		 //magic index found as mid is eqaul to arr[mid]
		 if(arr[mid]==mid) {
			 System.out.println("Magic index is " +mid +" number at index is "+arr[mid]);
			
		 }
		
		 //if mid > arr[mid] we need to search on right side of the array from mid+1 to the end 
		 if(arr[mid] < mid ) {
			 binSearchMagicIndex(mid+1, end, arr);
		 }
		 //if mid < arr[mid] search on left side of the arr from start to the mid
		 if(arr[mid]>mid) {
			 binSearchMagicIndex(start+1, mid, arr);
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -1, 0, 2, 5
				, 4, 10 };
		
		 binSearchMagicIndex(0, A.length-1,A)
		 ;
		 }

}
