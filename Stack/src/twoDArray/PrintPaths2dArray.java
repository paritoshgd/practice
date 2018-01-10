package twoDArray;

public class PrintPaths2dArray {
	
	
	static void printPaths(String tempString,int row,int col,int nRows,int nCols,char[][]arr) {
		
		String newString= tempString+arr[row][col];
		if(row==nRows-1 && col==nCols-1) {
			System.out.println(newString);
			return;
		}
		
		if(col+1<nCols) {
			printPaths(newString,row,col+1,nRows,nCols,arr);
			
		}
		
		if(row+1<nRows) {
			printPaths(newString,row+1,col,nRows,nCols,arr);
		}
		
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		char [] [] pathInput = {
				{'a', 'b', 'c', 'z'},
				{'d', 'e', 'f', 'y'},
				{'g', 'h', 'i', 'x'},
		};
		printPaths ("", 0, 0, pathInput.length, pathInput[0].length, pathInput);
	}

}
