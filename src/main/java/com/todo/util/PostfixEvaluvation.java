package com.todo.util;

import java.util.Stack;

/**
 * This class for Postfix Evaluation.
 * 
 * @author Balakumar
 *
 */
public class PostfixEvaluvation {

	public static int evaluate(String input) throws Exception {

		Stack<Integer> stack = new Stack<Integer>();
		char[] postfixExp = input.trim().toCharArray();

		for (int i = 0; i < postfixExp.length; i++) {
			char expChar = postfixExp[i];
			if (expChar >= '0' && expChar <= '9') {
				stack.push(expChar - '0');
			} else {
				int v2 = stack.pop();
				int v1 = stack.pop();

				switch (expChar) {
				case '+':
					stack.push(v1 + v2);
					break;
				case '-':
					stack.push(v1 - v2);
					break;
				case '*':
					stack.push(v1 * v2);
					break;
				case '/':
					stack.push(v1 / v2);
					break;

				}
			}
		}

		if (stack.size() > 1) {
			throw new Exception("Something wrong in Postfix Expression");
		} else {
			return stack.pop();
		}

	}
}
