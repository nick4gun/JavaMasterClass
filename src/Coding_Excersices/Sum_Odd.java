package Coding_Excersices;

public class Sum_Odd {

	public static void main(String[] args) {

		System.out.println(sumOdd(100, 1000));
	}

	public static boolean isOdd(int number) {
		if (number < 0) {
			return false;
		} else if (number % 2 == 0) {
			{
				return false;
			}
		} else {
			return true;
		}
	}

	public static int sumOdd(int start, int end) {
		if (start <= end && start > 0 && end > 0) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum += i;
				}
			}
			return sum;
		}
		return -1;
	}
}
