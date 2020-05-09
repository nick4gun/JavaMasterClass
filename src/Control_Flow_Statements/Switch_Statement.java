package Control_Flow_Statements;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;

		if (value == 1) {
			System.out.println("Value was 1");
		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("Was not 1 or 2");
		}

		// Good to use when only one variable is tested with different values
		// Otherwise if Statement is the best
		int switchValue = 2;

		switch (switchValue) {
			case 1 -> System.out.println("Value was 1");
			case 2 -> System.out.println("Value was 2");
			default -> System.out.println("Was not 1 or 2");
		}

		// Switch statement challenge

		char charValue = 'D'; // This is case sensitive cannot put sma;l alphabet

		switch (charValue) {
			case 'A' -> System.out.println("The character is A");
			case 'B' -> System.out.println("the character is B");
			case 'C' -> System.out.println("the character is C");
			default -> System.out.println("Its neither of the above, its " + charValue);
		}

		String month = "January"; // This is case sensitive cannot put sma;l alphabet

		switch (month) {
			case "January" -> System.out.println("Jan");
			case "March" -> System.out.println("March");
			default -> System.out.println("Not sure");
		}


	}

}
