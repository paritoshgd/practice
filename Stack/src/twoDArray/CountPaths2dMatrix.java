package twoDArray;


//http://algorithms.tutorialhorizon.com/dynamic-programming-count-all-paths-from-top-left-to-bottom-right-of-a-mxn-matrix/
// use dp best solution
public class CountPaths2dMatrix {
	
   static int countPath2dDP(int [][] arr) {
	  
	   int []results [] = new int [arr.length][arr.length];
	   
	  //base there is only one cell in the array
	   results[0][0]=1;
	   // path to any cell in first row is 1 
	   for(int i=0;i<arr.length;i++) {
		   results[0][i]=1;
	   }
	   //path to any cell in first column is 1 
	   for(int i=0;i<arr.length;i++) {
		   results[i][0]=1;
	   }
	  
	   for(int i=1;i<arr.length;i++) {
		   for(int j=1;j<arr.length;j++) {
			   results[i][j]=results[i-1][j]+results[i][j-1];
		   }
			   
	   }
	   return results[arr.length-1][arr.length-1];
	   
	  
   }
   //not good as time complexity is exponential
   static int countPathRecursion(int [][]arr,int row,int col) {
	   
	   if(row==arr.length-1 || col==arr.length-1) {
		   return 1;
	   }
	   return countPathRecursion(arr, row+1, col)+countPathRecursion(arr, row, col+1);
   }
   
   public static void main(String[] args) {
	   int arrA [][] = {{1,1,1},{1,1,1},{1,1,1}};
	   System.out.println("No Of Path (DP):- " +countPath2dDP(arrA));
	   System.out.println("No Of Path Recursion:- " +countPathRecursion(arrA, 0, 0));
	   
   }

}
