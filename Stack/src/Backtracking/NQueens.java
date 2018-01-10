package Backtracking;

public class NQueens {
	
	
	public static  boolean isSafe(int []a ,int n) {
		
		
		for(int i=0;i<n;i++) {
			
			if(a[i]==a[n])return false; //same column
			if ((a[i]-a[n])==(n-i))return false; //same major diagonal
			if ((a[n]-a[i])==(n-i))return false; //same minor diagonal
		}
		return true;
	}
	
	public static void printBoard(int []a) {
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[i]==j) {
					System.out.print("Q");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
			
	}
	public static void enumerate(int []a,int k) {
		
		int n= a.length;
		
		if(k==n) {
			printBoard(a);
		}else {
		    for(int i=0;i<n;i++) {
		    a[k]=i;
		    if(isSafe(a,k)) 
				enumerate(a,k+1);
		    
		}
	}
	}
	
	
	public static void enumerate(int n ) {
		
		int[] a = new int [n];
		
		enumerate(a,0);
	}
	
	
	public static void main(String[] args) {
		 int n = 8;
		enumerate(n);
	}

}
