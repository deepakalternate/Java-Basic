class Sort {
	
	public static void main(String[] args) {
		
		int a[] = {1, 1, 1, 2, 5, 7, 7, 8, 8, 9};
		int b[] = new int[10];
		int n = 10;

		int count = 0; 
		int i = 0;
		
		for (i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1])
				b[count++] = a[i];
		}

		if(a[i-1] != a[i])
			b[count++] = a[i];

		for (i = 0; i < count; i++) {
			System.out.println(b[i]);
		}
	}
}