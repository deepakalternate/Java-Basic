class Eh {
	int i = 2, j = 5;

	void show() {
		System.out.println("i = " + i + " || j = " + j);
	}
}

class Oh extends Eh {
	int k = 7;

	void show() {
		System.out.println("k = " + k);
		super.show();
	}
}

class UseOfSuper {
	public static void main(String[] args) {
		Oh o = new Oh();
		o.show();
		//o.super.show(); -> Wrong usage of super I'm guessing, will check
	}
}

/*
Can only use super in the subclass to make sense it seems, searching on the topic needed, mark the topic as open and move on.
*/