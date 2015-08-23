import java.util.Random; // Forgot to import this in the first attempt

class ForEachTrial {

	public static void main(String[] args) {
		
		int max = 50, min = 1, sum = 0, i; // Forgot to initialize sum to 0 in the second attempt, threw an error
		int arr[] = new int[10];

		Random rand = new Random();

		for (i = 0; i < 10; i++) {
			arr[i]	= rand.nextInt((max - min) + 1) + min;		
		}

		i = 0;

		for (int x : arr) {

			System.out.println("arr[" + i + "] : " + arr[i]);
			i++;

			sum += x;

		}

		System.out.println("\nSum: " + sum);

	}

}