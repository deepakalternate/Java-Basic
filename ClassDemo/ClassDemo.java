class Box {
	
	double width, height, depth;

	double volume(){
		double vol = width * height * depth;
		return vol;
	}

}

class ClassDemo {

	public static void main(String[] args) {

		Box mybox1 = new Box();
		Box mybox2 = new Box();


		mybox1.width = 4;
		mybox1.height = 5;
		mybox1.depth = 6;

		mybox2.width = 7;
		mybox2.height = 2;
		mybox2.depth = 8;

		double vol1 = mybox1.volume();
		double vol2 = mybox2.volume();

		System.out.println("Volume of mybox1 = " + vol1);
		System.out.println("Volume of mybox2 = " + vol2);
		
	}

}