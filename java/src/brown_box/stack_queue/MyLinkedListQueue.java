package brown_box.stack_queue;

public class MyLinkedListQueue implements IStackQueue {
	Node head;
	Node tail;
	public MyLinkedListQueue() {
		head = tail = null;
	}

	@Override
	public boolean push(int value) {
		if (isFull()) {
			return false;
		}
		Node node = new Node(value);
		if (isEmpty()) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}

		return true;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int value = head.value;

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}

		return value;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("queue is empty!");
		}
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.value + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}

	private static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
