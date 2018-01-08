package com.todo.util;

/**
 * This class for Postfix Evaluation.
 * 
 * @author Balakumar
 *
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PostfixEvaluvationTest {

	@Test
	public void testPostfixEvaluvation() {
		String input;
		String exp;
		int result;
		try {
			input = "5+2";
			exp = InfixToPostfix.converter(input).toString();
			result = PostfixEvaluvation.evaluate(exp);
			assertEquals(7, result);

			exp = InfixToPostfix.converter(input).toString();
			result = PostfixEvaluvation.evaluate(exp);
			assertNotEquals(8, result);
		} catch (Exception e) {

			assertFalse(false);
		}

	}

}
