package JavaConcepts;
import java.util.*;
public class FirstRepeatingArrayElement {
	
	//We need to find the element that occurs more than once and whose index of the first occurrence is smallest.

  //Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz52HPC6rrK
	static void firstRepeatingElement(int arr[]) {
		
		HashSet<Integer> set = new HashSet();
		int min=-1;
		//traverse array from right to left
		for(int i=arr.length-1;i>=0;i--) {
			// if the array contains element then set the min index to the element index as you are traversing from right to left
			if(set.contains(arr[i])) {
				min=i;
			}
			//add the element to the array if it is not contained
			else {
			set.add(arr[i]);
			}
		}
		
		System.out.println("first repeating element "+arr[min]);
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
       firstRepeatingElement(arr);
		
	}
}
