class A {
	private int a;

	void seta(int x) {
		a = x;
	}

	void showa() {
		System.out.println("a = " + a);
	}
}

class B extends A {
	void myownmethod() {
		System.out.println("Does nothing.");
	}
}

class MemberAccessInheritance {
	public static void main(String[] args) {
		B b = new B();
		//b.a = 7; -> This won't work, but if it has an interface it will work.
		b.seta(6);
		b.showa();
		b.myownmethod();
	}
}