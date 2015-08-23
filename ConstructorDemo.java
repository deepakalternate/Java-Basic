class Boxed {

	Boxed() {
		System.out.println("Non parametrized constructor.");
	}

	Boxed(int a) {
		System.out.println("Parametrized constructor, argument sent: " + a);
	}

}

class ConstructorDemo {

	public static void main(String[] args) {

		Boxed a = new Boxed();
		Boxed b = new Boxed(45);
		
	}

}