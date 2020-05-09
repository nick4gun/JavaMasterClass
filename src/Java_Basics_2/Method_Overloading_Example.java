package Java_Basics_2;

public class Method_Overloading_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double centimeters = calcFeetAndInchesToCentemeters(5, 13);
		if (centimeters < 0.0) {
			System.out.println("Invalid parameter");
		}

		calcFeetAndInchesToCentemeters(155);
	}

	public static double calcFeetAndInchesToCentemeters(double feet, double inches) {
		if (feet < 0 || (inches < 0 || inches > 12)) {

			System.out.println("Invalid feet or inches parameter");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;

	}

	public static double calcFeetAndInchesToCentemeters(double inches) {
		if (inches < 0) {
			return -1;

		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

		return calcFeetAndInchesToCentemeters(feet, remainingInches);

	}

}
