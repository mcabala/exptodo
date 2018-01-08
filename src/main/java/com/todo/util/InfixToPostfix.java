package com.todo.util;

import java.util.Stack;

/**
 * This class is used to convert from Infix to PostFix.
 * 
 * @author Balakumar
 *
 */
public class InfixToPostfix {

	public static StringBuilder converter(String input) throws Exception {

		char[] expArray = input.trim().toCharArray();
		StringBuilder postfixExp = new StringBuilder();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expArray.length; i++) {
			char exp = expArray[i];

			if (exp >= '0' && exp <= '9' || exp == '+' || exp == '-' || exp == '*' || exp == '/' || exp == '('
					|| exp == ')') {

				if (exp >= '0' && exp <= '9') {

					postfixExp.append(exp);

				} else if (exp == ')') {

					while (!stack.isEmpty() && stack.peek() != '(') {

						postfixExp.append(stack.pop());

					}
					if (!stack.isEmpty() && stack.peek() == '(')
						stack.pop();

				} else {

					if (exp == '(') {
						stack.push(exp);
					} else {

						while (true) {

							if (!stack.isEmpty()
									&& PrecedenceUtil.map.get(stack.peek()) >= PrecedenceUtil.map.get(exp)) {

								postfixExp.append(stack.pop());
							} else {
								break;
							}

						}

						stack.push(exp);
					}

				}

			} else {

				throw new Exception("Invalid Symbol '" + exp + "' present in expression");
			}
		}

		while (!stack.isEmpty()) {
			postfixExp.append(stack.pop());
		}
		return postfixExp;
	}
}
