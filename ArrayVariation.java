class ArrayVariation{

	public static void main(String[] args) {

		int arr1[] = {2, 3, 8, 7, 1};

		int arr2[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arr2[i] = i + 3 + i * 3;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

	}

}