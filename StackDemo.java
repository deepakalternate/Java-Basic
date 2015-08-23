import java.util.Random;

class StackDemo {

	public static void main(String[] args) {

		Stack stacktest = new Stack();

		int max = 50, min = 1, test;
		Random r = new Random();

		System.out.println("Numbers entered in stack in order: ");

		for (int i = 0; i < 10; i++) {
			test = r.nextInt((max - min) + 1) + min;
			stacktest.push(test);
			System.out.println(test);
		}

		System.out.println("Stack order of popping: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(stacktest.pop());
		}
		
	}

}

class Stack {

	int stck[] = new int[10];
	int tos;

	Stack() {
		tos = -1;
	}

	void push (int item) {
		if (tos == 9) {
			System.out.println("Stack Overflow");
		}
		else {
			stck[++tos] = item;
		}
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			return stck[tos--];
		}
	}

}