class BreakLabel {

	public static void main(String[] args) {

		boolean t = true;

		First: {
			Second: {
				Third: {
					System.out.println("Just before applying the break.");
					if (t) break Second;
					System.out.println("Right after break, shouldn't show.");
				}
				System.out.println("After the Third block, break applied with label Second, shouldn't show.");
			}
			System.out.println("After the Second block, should show");
		}

	}

}