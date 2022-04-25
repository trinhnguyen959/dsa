package brown_box.array;

// 1295: https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class _1295FindNumberWithDigit {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 55};

		System.out.println(findNumbers(numbers));
	}

	public static int findNumbers(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (countDigits(number) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int countDigits(int number) {
		int count = 0;
		int result = number;
		while (result != 0) {
			result = number / 10;
			number = result;
			count++;
		}
		return count;
	}
}
