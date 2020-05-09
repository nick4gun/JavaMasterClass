package Control_Flow_Statements;

import java.util.Scanner;

public class Reading_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your birth year: ");

		boolean hasNextInt = scanner.hasNextInt();

		if (hasNextInt) {

			int yearBirth = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter your name: ");
			String name = scanner.nextLine();

			int age = 2020 - yearBirth;

			if (age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years old.");
			} else {
				System.out.println("Invalid birth year");
			}

		} else {
			System.out.println("Umable to pass birth year");
		}

		scanner.close();
	}
}
