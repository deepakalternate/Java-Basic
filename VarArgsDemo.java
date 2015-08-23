class VarArgsDemo {

	public static void main(String[] args) {
		therewego(23, 45, 66, 7, 12);
		therewego();
		therewego(2, 1, 5);
	}

	static void therewego(int ... x) {
		System.out.print("Number of arguments: " + x.length + ".");
		if (x.length != 0){
			System.out.print(" Contents: ");
			for (int v : x) {
				System.out.print(v + " ");
			}
		}
		System.out.println();
	}
	
}