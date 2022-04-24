package brown_box.linked_list;

public class MyLinkedList {

	public static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public static void print(Node head) {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			Node tmp = head;
			while (tmp != null) {
				System.out.print(tmp.value);
				tmp = tmp.next;
				if (tmp != null) {
					System.out.print("->");
				} else {
					System.out.println();
				}
			}
		}
	}

	public static Node addToHead(Node head, int value) {
		Node node = new Node(value);
		if (head != null) {
			node.next = head;
		}
		return node;
	}

	public static Node addToTail(Node head, int value) {
		Node node = new Node(value);
		if (head == null) {
			return node;
		} else {
			// find last node
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			// assign last for new node
			last.next = node;
		}
		return head;
	}

	public static Node addToIndex(Node head, int value, int index) {
		if (index == 0) {
			return addToHead(head, value);
		} else {
			// find location to add
			Node newNode = new Node(value);
			Node current = head;
			int count = 0;
			while (current != null) {
				count++;
				if (count == index) {
					// add
					newNode.next = current.next;
					current.next = newNode;
					break;
				}
				current = current.next;
			}
		}
		return head;
	}

	public static Node removeAtHead(Node head) {
		if (head != null) {
			return head.next;
		}
		return null;
	}

	public static Node removeAtTail(Node head) {
		if (head == null) {
			return null;
		}
		// find last and previous
		Node last = head;
		Node previous = null;

		while (last.next != null) {
			previous = last;
			last = last.next;
		}

		// case one node
		if (previous == null) {
			return null;
		} else {
			previous.next = null;
		}

		return head;
	}

	public static Node removeAtIndex(Node head, int index) {
		if (head == null || index < 0) {
			return null;
		}

		if (index == 0) {
			return removeAtHead(head);
		}

		Node current = head;
		Node previous = null;
		int count = 0;
		boolean isFound = false;
		while (current != null) {
			if (count == index) {
				// remove
				isFound = true;
				break;
			}
			previous = current;
			current = current.next;
			count++;
		}

		if (isFound) {
			previous.next = current.next;
		}

		return head;
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.next = n2;
		n2.next = n3;

		print(n1);
		n1 = removeAtIndex(n1, 0);
		print(n1);
		n1 = removeAtIndex(n1, 1);
		print(n1);
		n1 = removeAtIndex(n1, 2);
		print(n1);
	}
}
