package Coding_Excersices;

public class Sum_Of_Three_and_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				sum += i;
				System.out.println("Found number = " + i);
			}
			if (count == 5) {
				break;
			}
		}
		System.out.println("Sum = " + sum);
	}
}
