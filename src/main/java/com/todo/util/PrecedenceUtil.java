package com.todo.util;

import java.util.HashMap;
import java.util.Map;

/**
 * This class used for precedence purpose.
 * 
 * @author Balakumar
 *
 */
public class PrecedenceUtil {

	public static Map<Character, Integer> map = new HashMap<Character, Integer>();

	static {
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('(', 0);
		map.put(')', 0);

	}

}
