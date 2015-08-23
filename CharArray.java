class CharArray{
	
	public static void main(String[] args) {
		
		char ch[];
		int i = 5;

		ch = new char[i];

		for (int j = 0; j < i ; j++) {
			ch[j] = (char) (56 + j * 3); // Forgot about automatic type promotion the first time, keep it in mind next times
			System.out.println("ch[" + j + "] = " + ch[j]);
		}

	}
}