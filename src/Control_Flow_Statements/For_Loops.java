package Control_Flow_Statements;

public class For_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 9; i++) {

			System.out.println("10000 at " + i + "% Intrest rate is " + calculateIntrest(10000.0, i));

		}

		System.out.println("          Using i--   ");

		for (int i = 8; i >= 2; i--) {

			System.out.println("10000 at " + i + "% Intrest rate is " + calculateIntrest(10000.0, i));

		}

	}

	public static double calculateIntrest(double amount, double intrestRate) {

		return (amount * (intrestRate / 100));

	}
}
