class AA {
	void show(){
		System.out.println("Inside AA");
	}
}

class AB extends AA {
	int show(int x){ //Without parameter got the error that int can't override void, so return type is not a part of type signature
		System.out.println("Inside AB");
		return x;
	}
}

class MethodOverriding {
	public static void main(String[] args) {
		AB ab = new AB();
		ab.show();
		int i = ab.show(33);
		System.out.println(i);
	}
}