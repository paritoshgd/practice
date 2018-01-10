package JavaConcepts;

import java.util.Arrays;

//locate minima or maxima in O(1)

public class LocalMinMaxWithoutTraverse {
	
	static void findMinMax(int arr[]) {
		
		int size=arr.length;
		int lastElement= arr[size-1];
		int firstElement = arr[0];
		
		if(firstElement+size-1==lastElement||firstElement-size+1==lastElement) {
			System.out.println("There is no local maxima or minima");
			
			
		}
		
		else {
			//Check for local maxima
			if(firstElement<arr[1]) {
				
				int lastElementShouldBe=firstElement+size-1;
				int  maxima = (lastElementShouldBe+lastElement)/2;
				System.out.println("Maxima is "+maxima);
			}
			//find the local minima
			else {
				
				int lastElementShouldBe=firstElement-(size-1);
				int  minima = (lastElementShouldBe+lastElement)/2;
				System.out.println("Minima is "+minima);
				
			}
			
			
		}
		
			
	}
	
	public static void main(String[] args) {
		
		int a []  = {3,4,5,4,3,2,1,0,-1};
        System.out.print(Arrays.toString(a));
        findMinMax(a);
        int b []  = {-4,-5,-6,-5,-4,-3};
        System.out.print(Arrays.toString(b));
        findMinMax(b);
	}

}
