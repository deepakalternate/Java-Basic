class NestTry {
	
	static void nestedtries (int a) {
		try {
			if (a == 1)
				a = a / (a - a);
			if (a == 2){
				int c[] = {1};
				c[77] = a * 44;
			} 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AOOB: " + e);
		}
	}

	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 447 / a;
			nestedtries(a);
		} catch (ArithmeticException e) {
			System.out.println("/0: " + e);
		}
	}
}