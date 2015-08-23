class BasicInput {

	public static void main(String[] args) throws java.io.IOException {

			char choice;

			System.out.println("Enter a character: ");
			choice = (char) System.in.read(); // Typecasted because the return type is Integer

			System.out.println("\nYou entered: " + choice);

	}

}