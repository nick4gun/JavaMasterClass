package Coding_Excersices;

import java.util.Scanner;

public class Reading_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		int sum = 0;

//		while (true) {
		while (counter < 10) {
			int order = counter + 1;
			System.out.println("Enter number # " + order + ":");

			boolean isAnInt = scanner.hasNextLine();

			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
//				if (counter == 10) {
//					break;
//				}
			} else {
				System.out.println("Invalid Number");
			}

			scanner.nextLine();
		}
		System.out.println("Sum = " + sum);
		scanner.close();
	}

}
