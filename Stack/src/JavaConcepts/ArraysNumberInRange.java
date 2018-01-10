package JavaConcepts;


//http://algorithms.tutorialhorizon.com/check-if-array-contains-all-elements-of-some-given-range/

//Very important this is to find if . 

//Given an array of unsorted num­bers, check if it con­tains all ele­ments of some given range.
public class ArraysNumberInRange {
	
	
	static boolean findIfInRange(int arr[],int x,int y) {
		
		int range = y-x;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=x && arr[i] <=y) {
				
				int z= arr[i]-x;
				arr[z]=arr[z]*-1;
			}
		}
		
		for(int i=0;i<range;i++) {
			if(arr[i]>0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws java.lang.Exception {
		int[] arrA = { 11, 17, 13, 19, 15, 16, 12, 14 };
		int x = 2;
		int y = 20;
		
		System.out.println(findIfInRange(arrA, x, y));
	}
	
}
