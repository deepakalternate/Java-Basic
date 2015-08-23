class TwoDArray{
	
	public static void main(String[] args) {
		
		//Initialization method 1
		int twod1[][];
		twod1 = new int[4][4];

		//Initialization method 2
		int twod2[][] = new int[4][];
		twod2[0] = new int[4];
		twod2[1] = new int[4];
		twod2[2] = new int[4];
		twod2[3] = new int[4];

		//Initialization method 3
		int twod3[][] = {
			{2,5,8,9},
			{5,4,2,8},
			{4,5,7,9},
			{1,1,2,3}
		};


		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4 ; j++) {

				twod1[i][j] = j * 1 + i * 2 + 1;
				
				twod2[i][j]	= i * 1 + j * 2 + 2;			

				System.out.println("twod1[" + i + "][" + j + "] = " + twod1[i][j]);
				System.out.println("twod2[" + i + "][" + j + "] = " + twod2[i][j]);
				System.out.println("twod3[" + i + "][" + j + "] = " + twod3[i][j]);
			}
			
		}

	}

}