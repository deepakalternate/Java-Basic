class Spiral {
	public static void main(String[] args) {
		
		int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int m = 4, n = 4;

		int t = 0, l = 0, b, r, dir = 0;
		b = m - 1;
		r = n - 1;

		 while (t <= b && l <= r) {
		 	
		 	//left to right
		 	if (dir == 0) {
		 		for (int  i = l; i <= r; i++) {
		 			System.out.println(a[t][i]);
		 		}
		 		dir = 1;
		 		t++;
		 	}

		 	//top to bottom
		 	else if (dir == 1) {
		 		for (int i = t; i <= b; i++) {
		 			System.out.println(a[i][r]);
		 		}
		 		dir = 2;
		 		r--;
		 	}

		 	//right to left
		 	else if (dir == 2) {
		 		for (int i = r; i >= l; i--) {
		 			System.out.println(a[b][i]);
		 		}
		 		dir = 3;
		 		b--;
		 	}

		 	//bottom to top
		 	else if (dir == 3) {
		 		for (int i = b; i >= t; i--) {
		 			System.out.println(a[i][l]);
		 		}
		 		dir = 0;
		 		l++;
		 	}

		 }
	}
}