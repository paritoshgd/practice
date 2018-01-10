package twoDArray;

public class CountAllPathsAndDiagonals {
	
	static int countAllPaths(int[][]arr) {
		
		
		int results[][]=arr;
		
		 for(int i=0;i<arr.length;i++) {
			 results[0][i]=1;
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 results[i][0]=1;
		 }
		 
		 //count the paths including diagonals thats why i-1 and j-1
		 for(int i=1;i<arr.length;i++) {
			 for(int j=1;j<arr.length;j++) {
				 
				 results[i][j]=results[i-1][j]+results[j-1][i]+results[i-1][j-1];
			 }
		 }
		 
		 return results[arr.length-1][arr.length-1];
	}
	
	public static void main(String[] args) {
		
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("No of paths By Dynamic Programming: "
				+ countAllPaths(a));
	}

}
