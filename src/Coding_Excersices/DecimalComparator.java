package Coding_Excersices;

public class DecimalComparator {
	public static void main(String[] args) {
		DecimalComparator.areEquallyByThreeDecimalPlaces(3.14987, 3.14887);
	}

	public static boolean areEquallyByThreeDecimalPlaces(double parameterOne, double parameterTwo) {

		if ((int) (parameterOne * 1000) == (int) (parameterTwo * 1000)) {

			System.out.println("true");
			return true;
		}

		System.out.println("false");
		return false;

	}

}
