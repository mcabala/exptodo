package com.todo;

import com.todo.util.InfixToPostfix;
import com.todo.util.PostfixEvaluvation;

/**
 * Main class for this application.
 * 
 * @author Balakumar
 *
 */
public class Calculator {

	public static void main(String args[]) throws Exception {

		System.out.println(PostfixEvaluvation.evaluate(InfixToPostfix.converter("5+2").toString()));

		System.out.println(PostfixEvaluvation.evaluate(InfixToPostfix.converter("5+2*(3/2)").toString()));

		System.out.println(PostfixEvaluvation.evaluate(InfixToPostfix.converter("5+(2/3)*(3*(2/3))").toString()));

	}
}
