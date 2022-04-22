package brown_box.hash_table;

import java.util.HashMap;

public class UniqueCharacter {
	public static void main(String[] args) {
		String leetCode = "loveleetcode";
		System.out.println(firstUniqueChar(leetCode));
	}

	public static int firstUniqueChar(String input) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!hashMap.containsKey(c)) {
				hashMap.put(c, 1);
			} else {
				hashMap.put(c, hashMap.get(c) + 1);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (hashMap.get(c) == 1) {
				return i;
			}
		}

		return -1;
	}
}
