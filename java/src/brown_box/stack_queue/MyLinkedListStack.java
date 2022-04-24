package brown_box.stack_queue;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {
	Node topNode;

	public MyLinkedListStack() {
		topNode = null;
	}

	@Override
	public boolean push(int value) {
		if (!isFull()) {
			Node node = new Node(value);
			node.next = topNode;
			topNode = node;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int value = topNode.value;
		topNode = topNode.next;
		return value;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("stack is empty!");
		} else {
			Node tmp = topNode;
			ArrayList<Integer> tmpList = new ArrayList<>();
			while (tmp != null) {
				tmpList.add(tmp.value);
				tmp = tmp.next;
			}

			for (int i = tmpList.size() - 1; i >= 0; i--) {
				System.out.print(tmpList.get(i) + " ");
			}
			System.out.println();
		}
	}

	private static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
