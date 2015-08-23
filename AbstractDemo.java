abstract class AbBase {

	abstract void show();

	void thisworkstoo() {
		System.out.println("This has a definition in the superclass itself.");
	}
}

class AbLevel extends AbBase {

	void show() {
		System.out.println("Was forced to make this because of the stupid abstract class.");
	}

	void iammyownself() {
		System.out.println("I can make my own stuff too.");
	}
}

class AbstractDemo {

	public static void main(String[] args) {
		
		AbLevel abl = new AbLevel();
		abl.iammyownself();

		AbBase abb; // = new AbBase(); -> "AbBase is abstract; cannot be instantiated" = Error displayed
		abb = abl; //Superclass reference variable can refer to the object of subclass derived from it
		System.out.println("Using Superclass variable here.");
		abb.thisworkstoo(); 
		abb.show(); //Dynamic Method Dispatch at work here, can't make an object of the abstract class but reference is allowed
		System.out.println("Using Subclass variable here.");
		abl.thisworkstoo();
		abl.show();

	}

}