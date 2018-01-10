package twoDArray;

public class PrintDiagonals {
	
	static void printDiagonals(int[][]arr) {
		
		
		int row=0;
	    int col;
		while(row<arr.length) {
			col=0;
			int rowtemp=row;
			while(rowtemp>=0) {
				
				System.out.print(arr[rowtemp][col]);
				rowtemp--;
				col++;
				
			}
			System.out.println();
			row++;
			
		}
		
		col=1;
		
		while(col<arr.length) {
			
			int coltemp=col;
			row=arr.length-1;
			while(coltemp<=arr.length-1) {
				
				System.out.print(arr[row][coltemp]);
				row--;
				coltemp++;				
			}
			System.out.println();
			col++;
			
		}
		
	}
	
	public static void main(String[] args) {
        int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printDiagonals(a);

    }

}
