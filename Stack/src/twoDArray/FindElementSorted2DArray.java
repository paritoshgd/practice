package twoDArray;
// http://algorithms.tutorialhorizon.com/algorithms-find-an-element-in-2-dimensional-sorted-array/
public class FindElementSorted2DArray {
	
		static boolean findElementInArray(int[][]arr,int numberToFind) {
			
			int numRows=arr.length;
			int numCols=arr[0].length;
			boolean elementFound=false;
			int rows =0;
			int cols=arr[0].length-1;
			
			// start from the left top corner, say ele;
			// if ele>number -> move left (move to currentColumn -1
			// if ele<number -> move down to next row .
			// if you cant move further to find the number , return false
			while(elementFound==false) {
				
				int element=arr[rows][cols];
				System.out.print(element+"->");
				if(element==numberToFind) {
					return true;
					
				}
				else if(element < numberToFind)
						rows++;
				else if(element > numberToFind)
						cols--;
					
			   if(rows > numRows-1 || cols <0 )
					return false;
			}
			return false;
						
	}
		
	
		public static void main(String args[]) {
			int[][] a = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 },
					{ 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
			int number1 = 15;
			int number2 = 5;
			int number3 = 19;
			int number4 = 25;
		
			System.out.println("The " + number1 + " present in 2D array a ??? :"
					+ findElementInArray(a, number1));
			System.out.println("The " + number2 + " present in 2D array a ??? :"
					+ findElementInArray(a, number2));
			System.out.println("The " + number3 + " present in 2D array a ??? :"
					+ findElementInArray(a, number3));
			System.out.println("The " + number4 + " present in 2D array a ??? :"
					+findElementInArray(a, number4));
		}

}
