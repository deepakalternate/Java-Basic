class BreakLabelLoop {

	public static void main(String[] args) {

		Outer: for (int i = 0; i < 4 ; i++) {
			
			System.out.print("Pass " + i + ": ");

			for (int j = 0; j < 100; j++) {

				System.out.print(j + " ");

				if (j == 10) {
					System.out.println("");
					break Outer;
				}
				
			}

			System.out.println("This shouldn't show.");

		}

		System.out.println("Loops Complete.");
		
	}

}