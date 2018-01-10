package Recursion;

public class ReverseString {
	
	static void reverseString(String s,int i) {
		
		if(i<s.length()) {
			char c = s.charAt(s.length()-i-1);
			  System.out.print(c);
			  reverseString(s,i+1); 
		}
	}
	
	public static void main(String[] args) {
		
		reverseString("I am India",0);
	}
}
