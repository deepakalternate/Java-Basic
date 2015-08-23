class ContinueTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			if (i % 2 == 0) continue;
			System.out.println(""); // When i is divisible by 2 this is skipped and it goes directly to increment i, 
			//so line changes when the number is not divisible by 2
		}
		
	}
	
}