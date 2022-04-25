package brown_box.linked_list;

public class RevertLinkedList {
	public static class ListNode {
		int val;
		ListNode next;

		public ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			ListNode next = current.next;
			current.next = next.next;
			next.next = head;
			head = next;
		}
		return head;
	}

	public static ListNode recursionList(ListNode head) {
		// co so
		if (head == null) {
			return null;
		}

		ListNode next = head.next;

		// 1 node
		if (next == null) {
			return head;
		}

		ListNode newHead = recursionList(next);
		next.next = head;
		head.next = null;

		return newHead;
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.printf("%d ", head.val);
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		a1.next = a2;
		a2.next = a3;
		print(a1);
		ListNode newList = reverseList(a1);
		print(newList);
		System.out.println("================");

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		print(n1);

		ListNode listNode = recursionList(n1);
		print(listNode);

	}
}
