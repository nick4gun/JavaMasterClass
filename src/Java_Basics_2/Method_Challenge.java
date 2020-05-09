package Java_Basics_2;

public class Method_Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tom", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Jack", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(40);
		displayHighScorePosition("Ryan", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Robert", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Linus", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Gilbert", highScorePosition);
	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {

		System.out.println(
				playerName + " managed to get into position " + highScorePosition + " on the high score table ");
	}

	public static int calculateHighScorePosition(int playerScore) {

		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		}
		return 4;

		// Alternate Code

		/*
		 * int position = 4; // Assuming position 4 will returned
		 * 
		 * if (playerScore >= 1000) { position = 1; } else if (playerScore >= 500) {
		 * position = 2; } else if (playerScore >= 100) { position = 3; } return
		 * position;
		 */
	}
}
