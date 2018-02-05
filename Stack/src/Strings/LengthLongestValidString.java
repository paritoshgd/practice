package Strings;

import java.util.Stack;

/*
 * 
 * Given a string containing just the characters ’(’ and ’)’, find the length of the longest
valid (well-formed) parentheses substring.
For "(()", the longest valid parentheses substring is "()", which has length = 2. Another
example is ")()())", where the longest valid parentheses substring is "()()", which
has length = 4.
 */
public class LengthLongestValidString {
	
	public static int checkValidSequence(String s) {
		
		 int n = s.length();		 
		 Stack<Integer>stack = new Stack<Integer>();
		 stack.push(-1);
		 int result=0;
		 for(int i=0;i<n;i++) {
			 
			 if(s.charAt(i)=='(') {
				 stack.push(i); //store the index 
				 
			 }else {   // we have encountered ) .. 
				    //pop the index of the opening ( bracket
				  stack.pop();
				  if(!stack.empty())
				  result= Math.max(result,i-stack.peek()); 
				  else 
					  stack.push(i);
				 
			 }
		 }
		 return result;		 
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkValidSequence("((()()"));
		System.out.println(checkValidSequence("()(()))))"));
		System.out.println(checkValidSequence("()"));
		System.out.println(checkValidSequence(")()())"));
		System.out.println(checkValidSequence("(()())"));
		System.out.println(checkValidSequence("))))()))()))))(())"));
	}
	

}
