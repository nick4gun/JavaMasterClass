package Coding_Excersices;

public class Flour_Pack_Problem {

	public static void main(String[] args) {

//		Didnt got intended output

		System.out.println(canPack(2, 1, 11));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		if ((bigCount * 5 + smallCount) < goal) {
			return false;
		}
		int bigFill = goal / 5;
		if (bigFill * 5 + smallCount < goal) {
			return false;
		}
		return false;
	}

}
