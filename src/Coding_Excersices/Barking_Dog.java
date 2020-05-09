package Coding_Excersices;

public class Barking_Dog {
	public static void main(String[] args) {

		Barking_Dog.shouldWakeUp(true, 10);
	}

	public static void shouldWakeUp(boolean isBarking, int hourOfDay) {

		if (hourOfDay < 0 || hourOfDay > 23) {
			System.out.println("Invalid value");
			System.out.println("false");
		}
		if (isBarking && (hourOfDay < 8 || hourOfDay > 22)) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
