package brown_box.stack_queue;

public class MyArrayQueue implements IStackQueue {
	private final int[] array;
	private final int SIZE;
	private int head;
	private int tail;

	public MyArrayQueue(int size) {
		SIZE = size;
		array = new int[SIZE];
		head = tail = -1;
	}

	@Override
	public boolean push(int value) {
		if (!isFull()) {
			if (isEmpty()) {
				head++;
			}
			tail++;
			array[tail] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		int value = -1;
		if (!isEmpty()) {
			value = array[head];
			head++;

			if (head > tail) {
				head = tail = -1;
			}
		}
		return value;
	}

	@Override
	public boolean isFull() {
		return tail == SIZE - 1;
	}

	@Override
	public boolean isEmpty() {
		return head == -1 && tail == -1;
	}

	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("queue is empty!");
		} else {
			for (int i = head; i <= tail; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}

	private int count() {
		if (isEmpty()) {
			return 0;
		}

		return tail - head + 1;
	}
}
