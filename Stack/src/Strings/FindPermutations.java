package Strings;

public class FindPermutations {
	
	static void permute(String prefix,String s) {
		
		int n=s.length();
		System.out.println("Value of s " +s +s.length());
		if(n==0) System.out.println(prefix);
		else {
		for(int i=0;i<n;i++) {
			
			
			permute(prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1,n));
		}
		}
	}
	
	static void permuteRecurse(char[] s , int currentIndex) {
		
		 if(currentIndex==s.length-1) {
			 System.out.println(String.valueOf(s));
		 }
		 for(int i=currentIndex;i<s.length;i++) {
			 swap(s,currentIndex,i);
			 permuteRecurse(s,currentIndex+1);
			 swap(s,currentIndex,i);
		 }
	}
	
	private static void swap (char[] s,int source,int dest) {
		
		char temp = s[source];
		s[source]=s[dest];
		s[dest]=temp;
	}
	
	public static void main(String[] args) {
		//permute("","av");
		String av="ab";
		permuteRecurse(av.toCharArray(),0);
	}
}
