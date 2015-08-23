class ImBored {

	int eh;

	ImBored(int i) {
		eh = i;
	}
	
	void somethinggoeshere() {
		System.out.println("Eh");
	}

}

class ObjectClassDemo {

	public static void main(String[] args) {
		
		ImBored imb = new ImBored(5);
		ImBored imbc = new ImBored(5); // (ImBored) imb.clone(); -> Fixed type mismatch by typecasting but protected access in Object bullshit throwing error
		
		System.out.println("Are these two objects equal? " + imb.equals(imbc)); // Didn't return true, this is bullshit

		System.out.println("What's a hash code? This: " + imb.hashCode());

		System.out.println(imb.toString()); // Output was class name with address of object perhaps

		System.out.println("Class: " + imb.getClass()); // returned class ImBored

		//imb.finalize();
		//imbc.finalize(); finalize has protected access in Object

	}
}