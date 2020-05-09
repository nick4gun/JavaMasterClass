package Java_Basics_1;

public class Conditional_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If Else statement

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not a alien!");
			System.out.println("And I am scared of that");
		}

		int topScore = 80;
		if (topScore < 100) {
			System.out.println("You got high score! ");
		}

		int seconfTopscore = 95;
		if ((topScore > seconfTopscore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

		if ((topScore > 90) || (seconfTopscore <= 90)) {
			System.out.println("Either both of the conditions are true");
		}

		boolean isCar = false;
		if (isCar) {
			System.out.println("This is not supppose to happen");
		}
		// Ternary Operator

		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}

		// Operator Challenge

		double firstVariable = 20.00d; // Step 1
		double secondVariable = 80.00d; // Step 2
		double total = (firstVariable + secondVariable) * 100d; // Step 3
		System.out.println("Total of both double variable is = " + total);

		double remainder = total % 40d; // Step 4
		System.out.println("Remainder of step 3 and 40 is = " + remainder);

		boolean step_five = true;
		if (remainder == 0) {
			System.out.println("Step five is True");
		} else {
			System.out.println("Step five is False");
		}

		if (!step_five) {
			System.out.println("Got some remainder");
		}

	}

}
