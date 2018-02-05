package Histograms;

import java.util.Arrays;

/*
 * There are N children standing in a line. Each child is assigned a rating value. You are
giving candies to these children subjected to the following requirements:
1. Each child must have at least one candy. 2. Children with a higher rating get
more candies than their neighbors.
What is the minimum candies you must give?
 * 
 */
public class CandyDistribution {
	
	public static void giveCandy(int [] grades) {
		
		int candies[] = new int[grades.length];
		candies[0]=1;
		for(int i=1;i<grades.length;i++) {
			
			if(candies[i]==0) {
				candies[i]=1;
			}
			
			if(grades[i]>grades[i-1]) {
				candies[i]=candies[i-1]+1;
			}
		}
		System.out.println(" Grades are             ->"+Arrays.toString(grades));
		System.out.println("Candies after L-R pass  -> "+Arrays.toString(candies));
		
		for (int i=grades.length-1;i>0;i--) {
			if(grades[i-1]>grades[i]&&candies[i-1]<=candies[i]) {
				candies[i-1]=candies[i]+1;
			}			
		}
		System.out.println("Candies after R-L pass  -> "+Arrays.toString(candies));
		
		// you can calculate result in loop above but this is cleaner
		int result=0;
		for(int i=0;i<candies.length;i++) {
			result=result+candies[i];
		}
		System.out.println("The minimum number of candies is "+result);
		
	}
	
	public static void main(String[] args) {
		
		int[] grades = {2, 3, 4, 4, 3, 2, 1};
		giveCandy(grades);
	}

}
