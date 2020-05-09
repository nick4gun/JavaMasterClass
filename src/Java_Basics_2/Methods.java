package Java_Basics_2;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score " + highScore);

		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("your final score was " + highScore);

	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}

		return -1;

	}

}
