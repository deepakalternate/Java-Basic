class TernOp {

	public static void main(String[] args) {

		int i = 12, j = -7;

		i = i < 0? -i : i;
		j = j < 0? -j : j;

		System.out.println("Absolute value of i = " + i + " || Absolute value of j = " + j);
	
	}

}