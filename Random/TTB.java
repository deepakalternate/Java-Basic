import java.io.UnsupportedEncodingException;

class TTB {
	public static void main(String[] args) throws UnsupportedEncodingException {

		String test = "Bhar le baba";
		byte[] dundundun = null;

		dundundun = test.getBytes("UTF-8");

		//String to Binary
		String bina = new String();
		for (byte b : dundundun) {

			bina = bina + Integer.toBinaryString(b);
			System.out.println(Integer.toBinaryString(b));

		}

		System.out.println();
		System.out.println(bina);

		//Character to number
		char c = 's';
		int i = (int)c;
		byte b = (byte)i;
		System.out.println(b);

		String tester = "" + Integer.toBinaryString(b);
		
		//Conversion from binary to text is working on character by character basis, made a huge fuck up passing a string and forgetting how number representation works 2^n and so on
		int charchar = Integer.parseInt(tester, 2);

		String stm = new Character((char)charchar).toString();
		System.out.println(stm);
		
		//No more idiotic run time error because I forgot something
	}
}