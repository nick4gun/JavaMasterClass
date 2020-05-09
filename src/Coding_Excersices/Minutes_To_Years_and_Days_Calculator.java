package Coding_Excersices;

public class Minutes_To_Years_and_Days_Calculator {

	public static void main(String[] args) {

		printYearsAndDays(12345678);

	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid value");
		} else {
			long hours = minutes / 60;
			long days = hours / 24;
			long years = days / 365;
			long remainingDays = days % 365;
			System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
		}
	}

}
