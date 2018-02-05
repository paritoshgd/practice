package Strings;

import java.util.Stack;

public class EvalSolution {
	
	public static void evalString(String[] tokens) {
		
		String operators = "+-*/";
		int result=0;
		Stack<String>stack = new Stack<String>();
		
		for(String t:tokens) {
			if(!operators.contains(t)) {
				stack.push(t);
			}
			else {
				int a = Integer.valueOf(stack.pop());
				int b= Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch(index) {
				case 0: stack.push(String.valueOf(a+b));
						break;
				case 1: stack.push(String.valueOf(a-b));
						break;
				case 2: stack.push(String.valueOf(a*b));
						break;
				case 3: stack.push(String.valueOf(a/b));
						break;
				
				}
			}
		}
		result= Integer.valueOf(stack.pop());
		System.out.println(result);		
		
	}
	
	public static void main(String args[]) {
		
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		evalString(tokens);
	}

}