package com.greatlearning.dsalab3.problem1;

import java.util.Stack;

public class BalancingBrackets {
	
	public boolean isStringBalanced(String bracketExpression) {
		
		//declare stack to store brackets character
		Stack<Character> stack = new Stack<>();
		//traverse the string length and if opening brackets are found push them on stack
		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char c;
			switch (ch) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	

}
