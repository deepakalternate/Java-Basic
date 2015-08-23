class CurKillCat {

	public static void main(String[] args) {

		int i = 100, j = 200;

		while (++i < --j);

		if (i == j) {
			System.out.println("Equal");
		}

		System.out.println("Midpoint: "+i);
		
	}

}