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
				String loopString = "";
				while (stack.peek() != '[') {
					loopString = stack.pop() + loopString;
				}

				// remove
				stack.pop();

				// get number
				String numberStr = "";
				while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
					numberStr = stack.pop() + numberStr;
				}
				int nLoop = Integer.parseInt(numberStr);
				loopString = loopString.repeat(nLoop);

				// add result to stack
				for (int j = 0; j < loopString.length(); j++) {
					stack.push(loopString.charAt(j));
				}
			} else {
				stack.push(c);
			}
		}
		String result = "";
		while (!stack.isEmpty()) {
			result = stack.pop() + result;
		}

		return result;
	}
}
