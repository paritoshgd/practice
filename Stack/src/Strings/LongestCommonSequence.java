package Strings;

public class LongestCommonSequence {
	
	public static void lcs(String a,String b) {
		
		int m = a.length();
		int n = b.length();
		
		int opt[][]=new int[m+1][n+1];
		
		for(int i= m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(a.charAt(i)==b.charAt(j)) {
					opt[i][j]=opt[i+1][j+1]+1;
				}
				else {
					opt[i][j]=Math.max(opt[i+1][j], opt[i][j+1]);
				}
			}
		}
	
		String lcs="";
		int i=0,j=0;
		while(i<m && j<n) {
			if(a.charAt(i)==b.charAt(j)) {
				lcs+=a.charAt(i);
				i++;
				j++;
			}
			else if(opt[i+1][j]>=opt[i][j+1])i++;
			else j++;
		}
		
		System.out.println(lcs);
	}
	
	
	
	
	public static void main(String[] args) {
		
		String a = "GGCACCACG";
		String b="ACGGCGGATACG";
		lcs(a,b);
	}

}
