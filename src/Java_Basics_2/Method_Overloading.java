package Java_Basics_2;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int newScore = calculatorScore("Tom", 500);
		System.out.println("New score is " + newScore);
		calculatorScore(75);
		calculatorScore();

	}

	// Original method
	public static int calculatorScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	// Method overloaded with same method name as above method but arguements should
	// not match
	public static int calculatorScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}

	// We can also use the same method without any arguement
	public static int calculatorScore() {
		System.out.println("No player name, no player score");
		return 0;
	}

	/*
	 * Note: But cannot use same method with different return type as mentioned
	 * 
	 * public static void calculatorScore() {
	 * System.out.println("No player name, no player score"); }
	 */

}
