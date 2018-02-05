package Histograms;
/*
 * 
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate
(i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai)
and (i, 0). Find two lines, which together with x-axis forms a container, such that the
container contains the most water.
 */
public class ContainerWithMostWater {
	
	public static int  findcontainerMaxArear(int[] height) {
		
		int left=0; //start from left co-ord
		int right=height.length-1; // start from right co-ord;
		int maxArea=0;
		
		while(left <right) {
			int area=  (right-left)*Math.min(height[left], height[right]);
			if(maxArea<area) {
					maxArea=area;
			}
			
			if(height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println("Max Area is "+maxArea);
		return maxArea;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,2};
		System.out.println (findcontainerMaxArear(arr));
	}

}
