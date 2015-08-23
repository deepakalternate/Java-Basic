class Outer {
	
	int xouter = 100;

	void test(){
		Inner i = new Inner();
		i.display();
	}

	class Inner {
		void display(){
			System.out.println("There you go, xouter = " + xouter); // xouter is from the same instance that called it.
		}
	}

}

class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.xouter = 78;
		o.test();

		// Outer.Inner it = new Outer.Inner(); -> Works for static nested class

		Outer.Inner it = o.new Inner(); // An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.
	}

}