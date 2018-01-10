package Strings;

public class GenerateParentheses {
	
	static void generateParantheses( int n) {
		
		String []c = new String[n*2];
		
		for(int i=0; i<(c.length/2);i++) {
			
			c[i]="(";
			c[c.length-i-1]=")";
			
		}
	    
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	
	}
	
	//method to generate parenthesis with recursion
	static void generateRecursion(String curr,int open,int close,int n) {
		
		if(curr.length()== n*2) {
			System.out.println(curr);
		}
		else {
			if(open < n) {
			generateRecursion(curr+"(",open+1,close,n);
			}
			if(close <open) {
				generateRecursion(curr+")",open,close+1,n);
			}
		}
	}
			
	public static void main(String[] args) {
		//generateParantheses(2);
		generateRecursion("",0,0,1);
	}

}
