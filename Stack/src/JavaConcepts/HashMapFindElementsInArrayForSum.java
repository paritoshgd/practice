package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapFindElementsInArrayForSum {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int sum =5;
		checkSumWithIndex(arr,5);
	}
	
	public static  void checkSumWithIndex(int[] arr,int sum) {
		
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		 for(int i=0;i<arr.length;i++) {
			 
			 if(map.containsKey(sum-arr[i])) {
				  System.out.print("Pair found at index " + map.get(sum-arr[i])+ " and " + i); 
				  System.out.print(" Numbers are "+ (sum-arr[i])+ "  and " + arr[i]);
				  System.out.println();
			 }
			 map.put(arr[i], i);	
		}
		 
		
		
	}
}
