package Coding_Excersices;

public class Is_Even {

	public static void main(String[] args) {

		System.out.println(isEvenNumner(1234));

//		int number = 4;
//		int finishNumber = 20;

//		while (number <= finishNumber) {
//			number++;
//			if (!isEvenNumner(number)) {
//				continue;
//			}
//			System.out.println("Even number " + number);
//		}

		// Record total number of even numbers
		// break once 5 are found

		int number = 4;
		int finishNumber = 20;
		int evenNumberFound = 0;

		while (number <= finishNumber) {
			number++;
			if (!isEvenNumner(number)) {
				continue;
			}
			System.out.println("Even number " + number);
			evenNumberFound++;
			if (evenNumberFound >= 5) {
				break;
			}
		}
		System.out.println("Total even numbers found = " + evenNumberFound);
	}

	public static boolean isEvenNumner(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
