package Coding_Excersices;

public class Equal_Sum_Checker {
	public static void main(String[] args) {
		Equal_Sum_Checker.hasEqualSum(1, 1, 1);
	}

	public static boolean hasEqualSum(int parameterOne, int parameterTwo, int parameterThree) {

		if ((parameterOne + parameterTwo) == parameterThree) {

			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;

	}

}
