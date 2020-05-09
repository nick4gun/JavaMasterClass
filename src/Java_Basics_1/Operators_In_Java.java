package Java_Basics_1;

public class Operators_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		int prevciousResult = result;
		System.out.println("Previous Result = " + prevciousResult);
		result = result - 1;
		System.out.println("3 - 1 = " + result);
		System.out.println("Previous Result = " + prevciousResult);

		result = result * 10;
		System.out.println("2 * 10 = " + result);

		result = result / 5;
		System.out.println("20 / 5 = " + result);

		result = result % 3;
		System.out.println("4 % 3 = " + result);

		result++; // result = result + 1; // 1 + 1 = 2
		System.out.println("1 + 1 = " + result);

		result--;
		System.out.println("2 - 1 = " + result);

		result += 2;
		System.out.println("1 + 2 = " + result);

		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);

		result /= 3; // 30 / 3 = 10
		System.out.println("3 * 10 = " + result);

		result -= 2; // 10 - 2 = 8
		System.out.println("10 - 2 = " + result);

	}

}
