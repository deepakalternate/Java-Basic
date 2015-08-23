class SupDawg {
	int i, j;

	SupDawg(int a, int b) {
		i = a;
		j = b;
	}
}

class SubDawg extends SupDawg {
	int k;

	SubDawg(int a, int b, int c) {
		super(a, b);
		k = c;
	}
}

class SuperConstructor {
	public static void main(String[] args) {
		SubDawg subd = new SubDawg(3, 5, 2);
		System.out.println("i = " + subd.i + " || j = " + subd.j + " || k = " + subd.k);
	}
}

/*
Reference variable of a superclass can be assigned a reference variable of any subclass derived from that superclass
*/