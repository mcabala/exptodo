package com.todo.util;

/**
 * This class for InfixToPostfix Evaluation.
 * 
 * @author Balakumar
 *
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class InfixToPostfixTest {

	@Test
	public void testInfixToPostfix() {
		String exp = "5+2";
		String result;
		try {
			result = InfixToPostfix.converter(exp).toString();
			assertEquals("52+", result);

			result = InfixToPostfix.converter(exp).toString();
			assertNotEquals("8", result);
		} catch (Exception e) {
			assertFalse(false);
		}

	}

}
