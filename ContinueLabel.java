class ContinueLabel {

	//Should print a pyramid

	public static void main(String[] args) {

		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				System.out.print(j + " || ");
				
				if (i == j) {
					System.out.println("");
					continue outer;
				
				}
			}
		}
		
	}
	
}