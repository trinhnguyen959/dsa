package brown_box.stack_queue;

public interface IStackQueue {
	boolean push(int value);

	int pop();

	boolean isFull();

	boolean isEmpty();

	void show();
}
