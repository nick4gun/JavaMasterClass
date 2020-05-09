package Coding_Excersices;

public class Int_Equality_Printer {

	public static void main(String[] args) {

		printEqual(2, 1, 1);
	}

	public static void printEqual(int parameterOne, int parameterTwo, int parameterThree) {
		if (parameterOne < 0 || parameterTwo < 0 || parameterThree < 0) {
			System.out.println("Invalid value");
		} else if (parameterOne == parameterTwo && parameterTwo == parameterThree) {
			System.out.println("All numbers are equal");
		} else if (parameterOne != parameterTwo && parameterTwo != parameterThree && parameterThree != parameterOne) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither all are equal or different");
		}
	}
}
