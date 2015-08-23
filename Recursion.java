class Factorial {
	int calcFact(int n) {
		int result;

		if (n == 1) {
			return 1;
		}

		result = n * calcFact(n - 1);
		return result;
	}
}

class Recursion {

	public static void main(String[] args) {

		int arg = 10, fact;

		Factorial f = new Factorial();
		fact = f.calcFact(arg);

		System.out.println("Factorial of " + arg + ": " + fact);

	}

}