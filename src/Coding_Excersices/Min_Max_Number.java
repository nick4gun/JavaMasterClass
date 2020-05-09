package Coding_Excersices;

import java.util.Scanner;

public class Min_Max_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int min = 0; // int min = Integer.MINVALUE;
		int max = 0; // int MAX = Integer.MAXVALUE;
		boolean first = true;

		while (true) {

			System.out.println("Enter number: ");
			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();

				if (first) {
					first = false;
					min = number;
					max = number;
				}
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			} else {
				break;
			}
		}

		System.out.println("min = " + min + " max = " + max);
		scanner.close();

	}

}
