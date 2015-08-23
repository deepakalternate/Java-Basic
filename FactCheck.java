class FactCheck{
	
	public static void main(String args[]){

		byte b = 50;
		// b = b * 2; -> This does indeed throw a compile time error due to automatic type promotion
		b = (byte) (b * 2); // Casting fixes problem of automatic type promotion while evaluating different types

		System.out.println("Value of b: " + b);
	}
}