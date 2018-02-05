package Histograms;

import java.util.Arrays;

/*
 * 
 * Given n non-negative integers representing an elevation map where the width of each
bar is 1, compute how much water it is able to trap after raining.
For example, given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class WaterStoreInHistogram {
	
	
	public static int  findWaterStore( int [] height) {
		
		int result=0;
		if(height==null||height.length <2 ) {
			
			return result;
			
		}
		
		int max=0;
		int left[]= new int[height.length];
		int right[]= new int[height.length];
	   
		//from left to right find the max element and assign to left[] array index
		left[0]=height[0];
		max=left[0];
		for(int i=1;i<height.length;i++) {
			if(height[i]<max) {
				left[i]=max;
			}else {
				max=height[i];
				left[i]=max;
			}
			
		}
		
		//from right to left
		
		right[height.length-1]=height[height.length-1];
		max= right[height.length-1];
		
		//start from second last element and upto 0
		for(int i=height.length-2;i>=0;i--) {
			
			if(height[i]<max) {
				right[i]=max;
			}
			else {
				max=height[i];
				right[i]=max;
			}
		}
		
		System.out.println("Height Array --"+Arrays.toString(height));
		System.out.println("Left Array   --"+Arrays.toString(left));
		System.out.println("Right  Array --"+Arrays.toString(right));
		//compute amount of water stored
		for(int i=0;i<height.length;i++) {
			
			result=result+Math.min(left[i], right[i])-height[i];
		}
		return result;
	}

	public static void main(String[] args) {
		
		int [] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Amount of water stored "+findWaterStore(arr));
		
	}
}

