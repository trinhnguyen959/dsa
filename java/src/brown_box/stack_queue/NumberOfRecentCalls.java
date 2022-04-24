package brown_box.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {

	public static void main(String[] args) {
		Queue<Integer> integers = new LinkedList<>();
	}

	private static int ping(int t, Queue<Integer> queue) {
		queue.add(t);

		while (queue.peek() < (t - 3000)) {
			queue.remove();
		}

		return queue.size();
	}
}
