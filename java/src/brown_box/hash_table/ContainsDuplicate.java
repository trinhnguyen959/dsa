package brown_box.hash_table;

import java.util.HashSet;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] numbers) {
		HashSet<Integer> setInteger = new HashSet<>();

		for (int number : numbers) {
			if (setInteger.contains(number)) {
				return true;
			} else {
				setInteger.add(number);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] firstNumbers = {1, 2, 3, 4, 5, 6, 8};
		int[] secondNumbers = {1, 2, 3, 4, 5, 6, 1};

		System.out.println(containsDuplicate(firstNumbers));
		System.out.println(containsDuplicate(secondNumbers));
	}
}
