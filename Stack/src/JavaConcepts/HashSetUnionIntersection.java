package JavaConcepts;

import java.util.HashSet;

public class HashSetUnionIntersection {
	
	static void printUnion(int arr1[],int arr2[]) {
		
		HashSet<Integer> hashSetUnion= new HashSet();
		
		for(int i=0; i<arr1.length;i++) {
			hashSetUnion.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length;i++) {
			hashSetUnion.add(arr2[i]);
		}
		
	  System.out.println("Union " +hashSetUnion);	
	}
	
	static void printIntersection(int arr1[],int arr2[]) {
		
		HashSet<Integer> hashSetIntersection= new HashSet();
		for(int i=0; i<arr1.length;i++) {
			hashSetIntersection.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(hashSetIntersection.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		
		
	}
	
	 public static void main(String[] args) 
	    {
	        int arr1[] = {7, 1, 5, 2, 3, 6};
	        int arr2[] = {3, 8, 6, 20, 7};
	 
	        System.out.println("Union of two arrays is : ");
	        printUnion(arr1, arr2);
	         
	        System.out.println("Intersection of two arrays is : ");
	        printIntersection(arr1, arr2);        
	    }
	 

}
