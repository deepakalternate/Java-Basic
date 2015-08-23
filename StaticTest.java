class StaticTest {

	static void isitstatic() {
		System.out.println("isitstatic");
	}

	static {
		System.out.println("Ahem");
	}

	static {
		System.out.println("Static block");
	}

	static {
		System.out.println("Check");
	}

	public static void main(String[] args) {
		System.out.println("main");
		isitstatic();
		// System.out.println("Overambitious eh? " + WillItWork.a); -> Putting this in front still made the block to execute
		WillItWork.itmight(); // Though you do not need an object, you do need to specify the class name so method can be found
		System.out.println("Overambitious eh? " + WillItWork.a); // Same way it needs the class name to find exactly what variable you're talking about
	}

}

class WillItWork {
	static boolean a = true;

	static {
		System.out.println("WillItWork test"); // Just as you called itmight, this block got executed before it because that loaded the class in memory
	}

	static void itmight() {
		System.out.println("itmight");
	}
}

/* Order of execution, the first one to execute is the static block, in them the order of execution is the order of
	their occurance, then main executes and then main calls the other static method, which did NOT execute on its own
	and had to be called by main. */