package Recursion;

public class partition {
	
    static void printPartition(int n,int max, String prefix) {
    	
    	if(n==0) {
    		System.out.println(prefix);
    	}
    	else {
    		for( int i= Math.min(n,max);i>=1;i--) {
    			printPartition(n-i,i,prefix+" "+i);
    		}
    	}
    }
	
	public static void main(String[] args) {
		printPartition(99,99, "");
	}

}
