package Coding_Excersices;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(13));

		int count = 0;
		for (int i = 10; i <= 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is prime number");
				if (count == 10) {
					System.out.println("Exiting for_loop");
					break;
				}
			}

		}

	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
