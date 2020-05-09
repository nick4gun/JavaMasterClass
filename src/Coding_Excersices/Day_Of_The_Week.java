package Coding_Excersices;

public class Day_Of_The_Week {

	public static void main(String[] args) {

		System.out.println("Using switch statement");
		System.out.println("       ");

		printDayOfTheWeek(-1);
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
		printDayOfTheWeek(7);

		System.out.println("       ");
		System.out.println("Using If-Else statement");
		System.out.println("       ");

		printDayOfWeek(-1);
		printDayOfWeek(0);
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(7);

	}

//Using switch statement
	public static void printDayOfTheWeek(int day) {

		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}

	}

//Using If-Else statement
	public static void printDayOfWeek(int theDay) {

		if (theDay == 0) {
			System.out.println("Sunday");
		} else if (theDay == 1) {
			System.out.println("Monday");
		} else if (theDay == 2) {
			System.out.println("Tuesday");
		} else if (theDay == 3) {
			System.out.println("Wednesday");
		} else if (theDay == 4) {
			System.out.println("Thursday");
		} else if (theDay == 5) {
			System.out.println("Friday");
		} else if (theDay == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}

}
