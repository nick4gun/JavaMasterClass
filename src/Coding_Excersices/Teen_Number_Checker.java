package Coding_Excersices;

public class Teen_Number_Checker {
	public static void main(String[] args) {

		Teen_Number_Checker.hasTeen(20, 25, 31);

		Teen_Number_Checker.isTeen(25);

	}

	public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {

		if ((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19)) {

			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	public static boolean isTeen(int age) {

		if ((age >= 13) && (age <= 19)) {

			System.out.println("true");
			return true;

		}
		System.out.println("false");
		return false;

	}
}
