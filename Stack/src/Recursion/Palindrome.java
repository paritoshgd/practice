package Recursion;

public class Palindrome {
	
	static boolean isPalindrome(String s) {
		System.out.println(s)
		;
		if(s.length()<2) {// s.length<=1  || s.length==0
			return true;
		}
		else {
			char first=s.charAt(0);
			char last = s.charAt(s.length()-1);
					
			if(first==last) {
				 String temp = s.substring(1, s.length()-1);
				 return isPalindrome(temp);
			}else {
				return false;
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("madam"));
		
	}

}
