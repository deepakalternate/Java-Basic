class ElIfLad {

	public static void main(String[] args) {

		String months[] = {"Bogus", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Decemeber"};
		int month = 5;
		String season;

		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = "Bogus Month";

		System.out.println(months[month] + " is in the " + season + ".");
		
	}

}