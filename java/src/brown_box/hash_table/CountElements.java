package brown_box.hash_table;

import java.util.HashMap;
import java.util.Map;

public class CountElements {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 78, 1, 13, 45, 1, 1, 1};
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int number : numbers) {
			if (!hashMap.containsKey(number)) {
				hashMap.put(number, 1);
			} else {
				Integer appearCount = hashMap.get(number);
				appearCount++;
				hashMap.put(number, appearCount);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " appear " + entry.getValue() + " times");
		}
	}
}
