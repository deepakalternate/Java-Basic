class ArrayTest{

	public static void main(String[] args) {

		int arr[];
		int i = 5;
		arr = new int[i];

		for (int j = 0; j < i; j++) {
			arr[j] = 5 * j;
			System.out.println("arr[" + j + "]: "+arr[j]);
		}
	}
}