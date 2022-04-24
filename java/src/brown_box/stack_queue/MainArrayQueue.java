package brown_box.stack_queue;

public class MainArrayQueue {
	public static void main(String[] args) {
		MyArrayQueue arrayQueue = new MyArrayQueue(3);

		arrayQueue.push(1);
		arrayQueue.push(2);
		arrayQueue.push(3);
		arrayQueue.push(4);
		arrayQueue.show();

		arrayQueue.pop();
		arrayQueue.show();
		arrayQueue.pop();
		arrayQueue.show();
		arrayQueue.pop();
		arrayQueue.show();
	}
}
