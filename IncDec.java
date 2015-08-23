class IncDec {

	public static void main(String[] args) {

		int a = 5, b;

		b = a++; //Postfix Increment
		System.out.println("a: " + a + " || b: " + b);

		b = ++a; //Prefix Increment
		System.out.println("a: " + a + " || b: " + b);

		b = a--; //Postfix Decrement
		System.out.println("a: " + a + " || b: " + b);

		b = --a; //Prefix Decrement
		System.out.println("a: " + a + " || b: " + b);

	}

}