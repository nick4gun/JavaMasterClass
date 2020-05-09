package Control_Flow_Statements;

public class While_Loop {

	public static void main(String[] args) {

		int count = 1;
		while (count != 6) {
			System.out.println("Count valus is " + count);
			count++;
		}

		// Same example using for loop

		for (count = 1; count != 6; count++) {
			System.out.println("Count value is " + count);
		}

		// Using Do While

		count = 6;
		do {
			System.out.println("Count value is " + count);
			count++;
			if (count > 100) {
				break;
			}
		} while (count != 6);

	}

}
