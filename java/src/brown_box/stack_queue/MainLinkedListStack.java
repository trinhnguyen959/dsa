package brown_box.stack_queue;

public class MainLinkedListStack {
	public static void main(String[] args) {
		MyLinkedListStack myStack = new MyLinkedListStack();

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.show();

		myStack.pop();
		myStack.show();
		myStack.pop();
		myStack.show();
		myStack.pop();
		myStack.show();
		myStack.pop();
		myStack.show();
	}
}
