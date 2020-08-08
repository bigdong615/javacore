import java.util.ArrayDeque;

public class TwoQueueToAStack<T> {

	public ArrayDeque<T> queueOne = new ArrayDeque<T>();
	public ArrayDeque<T> queueTwo = new ArrayDeque<T>();

	public void push(T t) {
		queueOne.offer(t);
	}

	public T pop() {
		if (!queueOne.isEmpty() || !queueTwo.isEmpty()) {
			if (!queueOne.isEmpty()) {
				while (queueOne.size() > 1) {
					queueTwo.offer(queueOne.poll());
				}
				return queueOne.poll();
			} else if (!queueTwo.isEmpty()) {
				while (queueTwo.size() > 1) {
					queueOne.offer(queueTwo.poll());

				}
				return queueTwo.poll();
			}

		}

		return null;
	}

	public T top() {

		T top = null;
		if (!isEmpty()) {
			if (!queueOne.isEmpty()) {
				while (queueOne.size() > 1) {
					queueTwo.offer(queueOne.poll());
				}
				top = queueOne.peek();
				queueTwo.offer(queueOne.poll());
			} else if (!queueTwo.isEmpty()) {
				while (queueTwo.size() > 1) {
					queueOne.offer(queueTwo.poll());
				}
				top = queueTwo.peek();
				queueOne.offer(queueTwo.poll());
			}
			return top;
		}
		return null;
	}

	public boolean isEmpty() {
		return queueOne.isEmpty() && queueTwo.isEmpty();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoQueueToAStack<Integer> queueToAStack = new TwoQueueToAStack<Integer>();
		for (int i = 0; i < 5; i++) {
			queueToAStack.push(i);
		}

		System.out.println(queueToAStack.pop());
		System.out.println(queueToAStack.isEmpty());
		System.out.println(queueToAStack.top());
	}

}
