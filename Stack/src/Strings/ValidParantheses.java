package Strings;

import java.util.HashMap;
import java.util.Stack;

/*
 * 
 * Given a string containing just the characters ’(’, ’)’, ’’, ’’, ’[’ and ’]’, determine if the
input string is valid. The brackets must close in the correct order, "()" and "()[]" are all
valid but "(]" and "([)]" are not.
 */
public class ValidParantheses {
	
	public static boolean checkStringValid(String s) {
		
		HashMap<Character,Character>map = new HashMap<Character,Character>();
		map.put('(', ')');
		map.put('{','}');
		map.put('[',']');
		
		Stack<Character>stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);
			// push the character to the Stack only if it is present as part of the Map Key else it is invalid
			
			if(map.keySet().contains(c)) {
				stack.push(c);
			}else if(map.values().contains(c)) {
				
				if(!stack.empty()&& map.get(stack.peek())==c ) {
					stack.pop();
				}
				else {
					return false;
				}
			}
			
		}
		
		return stack.empty();		
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkStringValid("()[]")); //correct
		System.out.println(checkStringValid(")(][")); //incorrect
		System.out.println(checkStringValid("([])")); // correct
		System.out.println(checkStringValid("([)]")); //incorrect
	}

}
