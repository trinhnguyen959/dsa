package brown_box.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueJava {
	public static void main(String[] args) {
		// stack
		Stack<Integer> myStack = new Stack<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		for (Integer el : myStack) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		System.out.println("pop: " + myStack.pop());
		for (Integer el : myStack) {
			System.out.print(el + " ");
		}
		System.out.println("my stack is empty: " + myStack.isEmpty());
		System.out.println("=================================");

		// queue
		Queue<Integer> myQueue = new LinkedList<>();
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		myQueue.forEach(el -> System.out.print(el + " "));
		System.out.println();

		System.out.println("peek: " + myQueue.peek());
		System.out.println("remove: " + myQueue.remove());

		myQueue.forEach(el -> System.out.print(el + " "));
		System.out.println();
	}
}
