package brown_box.array;

// 88: https://leetcode.com/problems/merge-sorted-array/
public class _88MergeSortedArray {
	public static void main(String[] args) {
		int[] n1 = {2, 3, 4, 5, 0, 0, 0};
		int[] n2 = {0, 3, 6};
		merge(n1, 4, n2, 5);
		System.out.println("DONE");
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i : nums2) {
			addElementToArray(i, nums1, m);
			m++;
		}
	}

	private static void addElementToArray(int x, int[] a, int m) {
		for (int k = 0; k < m; k++) {
			if (a[k] > x) {
				for (int i = m - 1; i >= k; i--) {
					a[i + 1] = a[i];
				}
				a[k] = x;
				break;
			}

			a[m] = x;
		}
	}
}
