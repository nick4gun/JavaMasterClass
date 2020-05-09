package Coding_Excersices;

public class Leap_Year {
	public static void main(String[] args) {
		Leap_Year.isLeapYear(1700);
	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println(year + " is a leap year");
						return true;
					} else {
						System.out.println(year + " is not a leap year");
						return false;
					}
				} else {
					System.out.println(year + " is a leap year");
					return true;
				}
			} else
				System.out.println(year + " is not a leap year");
			return false;
		} else
			System.out.println("Enter valid number");
		return false;

	}
}