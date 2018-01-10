package JavaConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class FirstNonRepeatingArrayElement {
	
	static void firstNonRepeatingElement(int [] arr) {
		
	   TreeMap<Integer,Integer> map = new TreeMap();
	   
	   int indexofFirstNonRepeat=-1;
	
		for (int i=arr.length-1;i>=0;i--) {
			if(map.containsKey(arr[i])) {				
			    map.remove(arr[i]);
		}
			else {
				map.put(arr[i],i);
				indexofFirstNonRepeat=i;
			}
			
		}
		if(map.isEmpty()) {
			System.out.println("There are no non repeating elements in the array");
		}
		else {
		System.out.println("The non repeating elements with index are "+map);
		int minVal=Integer.MAX_VALUE;
		
		for (Integer key:map.keySet()) {
			if(minVal> map.get(key)) {
				minVal=map.get(key);
			}
		}
		System.out.println("First Non repeat element is " +arr[minVal]);
		}
}
		
	public static void main(String[] args) {
		
		int arr[] = {3,5, 3, 10, 5};
       firstNonRepeatingElement(arr);
		
	}
}
