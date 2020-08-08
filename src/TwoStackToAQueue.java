
import java.util.Stack;

public class TwoStackToAQueue<T> {

	Stack<T> stackOne = new Stack<T>();
	Stack<T> stackTwo = new Stack<T>();

	public void push(T data) {
		stackOne.push(data);
	}

	public T pop() {

		if (!stackOne.isEmpty()) {
			stackTwo.push(stackOne.pop());

		}
		T first = stackTwo.peek();

		stackOne.push(stackTwo.pop());
		return first;

	}

	public static void main(String[] args) {
		TwoStackToAQueue<Integer> aQueue = new TwoStackToAQueue<Integer>();
		aQueue.push(1);
		aQueue.push(2);
		aQueue.push(3);
		aQueue.push(4);
		aQueue.push(5);

		System.out.println(aQueue.pop());
		System.out.println(aQueue.pop());
		System.out.println(aQueue.pop());
	}

}
