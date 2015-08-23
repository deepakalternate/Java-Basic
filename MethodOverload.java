class MethodOverload {

	void testmet() {
		System.out.println("No parameters");
	}

	void testmet(int a) {
		System.out.println("One parameter: " + a);
	}

	void testmet(int a, int b) {
		System.out.println("Two parameters: " + a + " & " + b);
	}

	void testmet(double a) {
		System.out.println("Double as parameter: " + a);
	}

	public static void main(String[] args) {

		MethodOverload m = new MethodOverload(); // Needed to make this because it won't let me call methods without it
		//Similar error to this, non-static method cannot be referenced from a static context, guess the static main is the issue

		m.testmet();
		m.testmet(4);
		m.testmet(6, 5); //error when using this.testmet() -> "non-static variable this cannot be referenced from a static context"
		m.testmet(23.4);
		
	}

}