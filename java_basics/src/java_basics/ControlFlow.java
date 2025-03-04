package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub hi bhi

		boolean hungry = false;

		if (!hungry) {// read it as if not hungry
			System.out.println("i am starving1");
		} else {
			System.out.println("i am full1");
		}

		int hungerRating = 5;
		if (!(hungerRating < 6)) {// if hunger rating not less than 6
			System.out.println("Not Hungry");
		} else {
			System.out.println("i am starving2");
		}

		int favouriteTemp = 75;
		int currentTemp = 60;
		String opinion;

		if (favouriteTemp == currentTemp) {
			if (currentTemp <= (favouriteTemp - 30)) {
				opinion = "It's pretty Dorn Cold";
			} else if (currentTemp < (favouriteTemp - 20)) {
				opinion = "it's kinda cold out";
			} else if (currentTemp >= (favouriteTemp + 10)) {
				opinion = "It's hot out";
			} else {
				opinion = "it's a beautifull day";
			}
		} else {
			opinion = "unknown temp";
		}
		System.out.println(opinion);

		int month = 7;
		String monthString;
		
		switch(month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;			
		case 7:
			monthString = "July";
			break;
		default:
			monthString = "unknown month";
			break;
		}
		
		System.out.println(monthString);
	}

}
