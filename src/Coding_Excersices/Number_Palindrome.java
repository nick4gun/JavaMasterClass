package Coding_Excersices;

public class Number_Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome(1234554321));
	}

	public static boolean isPalindrome(int num) {
		int reverse = 0;
		int lastDigit = 0;
		int StartNumber = num;

		while (num != 0) {
			lastDigit = num % 10;

			reverse *= 10;
			reverse += lastDigit;
			num /= 10;

			if (StartNumber == reverse) {
				return true;
			}

		}
		return false;
	}

}
