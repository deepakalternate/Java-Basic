import java.util.Random;

class ForEachMul {

	public static void main(String[] args) {

		int max = 50, min = 1;
		int arr[][] = new int [4][4];

		Random rand = new Random();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = rand.nextInt((max - min) + 1) + min;
			}
		}

		for(int x[] : arr){
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
	}
	
}