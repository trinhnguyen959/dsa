package brown_box.hash_table;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class MyHashMap {
	private class Data {
		int key;
		int value;

		public Data(int key, int value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Data) {
				return this.key == ((Data) obj).key;
			}
			return false;
		}
	}

	private final int SIZE = 1000;
	private final ArrayList<Data>[] myBuckets;

	public MyHashMap() {
		myBuckets = new ArrayList[SIZE];
		for (int i = 0; i < myBuckets.length; i++) {
			myBuckets[i] = new ArrayList<>();
		}
	}

	private int hashFunction(int key) {
		return key % SIZE;
	}

	public void put(int key, int value) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Data> bucket = myBuckets[hashValueIndex];
		Data data = new Data(key, value);
		int keyIndex = bucket.indexOf(data);

		if (keyIndex >= 0) {
			bucket.get(keyIndex).value = value;
		} else {
			bucket.add(data);
		}
	}

	public void remove(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Data> bucket = myBuckets[hashValueIndex];

		Data data = new Data(key, 0);
		bucket.remove(data);
	}

	public int get(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Data> bucket = myBuckets[hashValueIndex];
		Data data = new Data(key, 0);
		int keyIndex = bucket.indexOf(data);

		if (keyIndex >= 0) {
			return bucket.get(keyIndex).value;
		}
		return -1;
	}

	public static void main(String[] args) {
		MyHashMap myHashMap = new MyHashMap();
		myHashMap.put(1, 1);
//		myHashMap.put(1, 2);
		myHashMap.put(2, 2);
		myHashMap.put(10, 2);

//		myHashMap.remove(1);

		System.out.println(myHashMap.get(1));
		System.out.println(myHashMap.get(2));
		System.out.println(myHashMap.get(10));
	}
}
