class RichDude {
	
	int money;

	void showrich() {
		System.out.println("This dude is rich.");
	}

}

class LuckyRelative extends RichDude {
	void showlucky() {
		money = 50000000;
		System.out.println("Rich dude died. Lucky dude has money = " + money + ".");
	}
}

class InheritDemo {
	public static void main(String[] args) {
		LuckyRelative lr = new LuckyRelative();
		lr.showlucky();
		lr.showrich();
	}
}