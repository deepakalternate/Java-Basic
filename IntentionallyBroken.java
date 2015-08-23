class IntentionallyBroken {

	public static void main(String[] args) {

		boolean t = true;
		
		for (int i = 0; i < 10 ; i++) {

			System.out.print("\nPass "+ i +": ");

			for (int j = 0; j < 10; j++) {
				System.out.print(j + " ");
				if (t) break;
				System.out.println("This shouldn't be reachable"); // Without the if in break this was marked as an error "Unreachable Statement"
			}

			System.out.println("");
			
		}

		outer: for (int i = 0; i < 10 ; i++) {

			System.out.print("\nPass "+ i +": ");

			for (int j = 0; j < 10; j++) {
				System.out.print(j + " ");
				if (t) continue outer;
				System.out.println("This shouldn't be reachable"); // Without the if in continue this was marked as an error "Unreachable Statement"
			}

			System.out.println(""); //This will never be executed as we're using the continue with the label pointing to the outer loop
			
		}

		if (t) return;

		System.out.println("Now I'm just messing with you compiler."); // Without the if in return this was marked as an error "Unreachable Statement"

	}
	
}