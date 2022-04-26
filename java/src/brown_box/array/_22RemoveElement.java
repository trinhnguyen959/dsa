package brown_box.array;

public class _22RemoveElement {
	public static void main(String[] args) {
		int[] numbers = {3, 2, 2, 3};
		System.out.println(removeElement(numbers, 2));
	}

	public static int removeElement(int[] numbers, int val) {
		int length = numbers.length;
		for (int i = 0; i < length; ) {
			if (numbers[i] == val) {
				for (int j = 0; j <= length - 2; j++) {
					numbers[j] = numbers[j + 1];
				}
				length--;
			} else {
				i++;
			}
		}
		return length;
	}
}
