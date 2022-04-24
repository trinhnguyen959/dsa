package brown_box.stack_queue;

public class MainLinkedListQueue {
	public static void main(String[] args) {
		MyLinkedListQueue myQueue = new MyLinkedListQueue();

		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.show();

		myQueue.pop();
		myQueue.show();
		myQueue.pop();
		myQueue.show();
		myQueue.pop();
		myQueue.show();
		myQueue.pop();
		myQueue.show();
	}
}
