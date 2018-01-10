package Recursion;

public class PermutationString {

	
	static void permuteString(char s[],int currentIndex) {
		
		if(currentIndex==s.length-1) {
			
			System.out.println(String.valueOf(s));
		}
		else {
			
			// choose the character
			for(int i=currentIndex;i<s.length;i++) {
			swap(s,currentIndex,i);
			permuteString(s,currentIndex+1);
			swap(s,currentIndex,i);
			}
		}
		}

		static void swap(char s[],int source,int dest) {
			
			char temp = s[source];
			s[source]=s[dest];
			s[dest]=temp;
		}
		
		public static void main(String[] args) {
			permuteString("abc".toCharArray(),0);
		}
}