package brown_box.stack_queue;

import java.util.Stack;

public class DecodeString {
	public static void main(String[] args) {
		System.out.println(decode("2[abc]"));
		System.out.println(decode("2[abc]2[vv]"));
	}

	private static String decode(String str) {
		Stack<Character> stack = new Stack<>();
		int length = str.length();

		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			if (c == ']') {
				// main

				// pop util meet [
				StringBuilder loopString = new StringBuilder();
				while (stack.peek() != '[') {
					loopString.insert(0, stack.pop());
				}

				// remove
				stack.pop();

				// get number
				StringBuilder numberStr = new StringBuilder();
				while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
					numberStr.insert(0, stack.pop());
				}
				int nLoop = Integer.parseInt(numberStr.toString());
				loopString = new StringBuilder(loopString.toString().repeat(nLoop));

				// add result to stack
				for (int j = 0; j < loopString.length(); j++) {
					stack.push(loopString.charAt(j));
				}
			} else {
				stack.push(c);
			}
		}
		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.insert(0, stack.pop());
		}

		return result.toString();
	}
}
