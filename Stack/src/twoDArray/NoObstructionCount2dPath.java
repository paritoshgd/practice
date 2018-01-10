package twoDArray;

public class NoObstructionCount2dPath {

	static int countPathWithoutObstruction(int[][] arr) {
		
		int result[][]=arr;
		
		for (int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				
				if(result[i][j]!=-1) {
					result[i][j]=0;
					if(result[i-1][j]>0) {
						result[i][j]+=result[i-1][j];
						}
					
					if(result[i][j-1]>0) {
						result[i][j]+=result[i][j-1];
					}
				}
								
			}
		}
		
		return result[arr.length-1][arr.length-1];
		
		
	}
	public static void main(String[] args) {
        int arrA [][] = {{1,1,1},{1,-1,1},{1,-1,1}};   
        
        System.out.println("No Of Path (DP):- " +countPathWithoutObstruction(arrA));
    }
}
