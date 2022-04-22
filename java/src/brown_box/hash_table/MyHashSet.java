package brown_box.hash_table;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class MyHashSet {
	private final int SIZE = 1000;
	private final ArrayList<Integer>[] myBuckets;

	public MyHashSet() {
		myBuckets = new ArrayList[SIZE];
		for (int i = 0; i < myBuckets.length; i++) {
			myBuckets[i] = new ArrayList<>();
		}
	}

	private int hashFunction(int key) {
		return key % SIZE;
	}

	public void add(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Integer> bucket = myBuckets[hashValueIndex];
		int keyIndex = bucket.indexOf(key);

		if (keyIndex < 0) {
			bucket.add(key);
		}
	}

	public void remove(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Integer> bucket = myBuckets[hashValueIndex];
		int keyIndex = bucket.indexOf(key);
		if (keyIndex >= 0) {
			bucket.remove(keyIndex);
		}
	}

	public boolean contains(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Integer> bucket = myBuckets[hashValueIndex];
		int keyIndex = bucket.indexOf(key);
		return keyIndex >= 0;
	}

	public static void main(String[] args) {
		MyHashSet myHashSet = new MyHashSet();
//		myHashSet.add(1);
//		myHashSet.add(1);
//		myHashSet.add(2);
//		myHashSet.add(100);
//		myHashSet.add(1000);
//		myHashSet.add(10_000);
//		myHashSet.add(100_000);
//		myHashSet.add(1_000_000);

		for (int i = 0; i < 1_000_000; i++) {
			myHashSet.add(i);
		}
		myHashSet.add(1_000_000);
//		myHashSet.remove(1);
		System.out.println("Set contains 1: " + myHashSet.contains(1));
		System.out.println("Set contains 2: " + myHashSet.contains(2));
	}
}
