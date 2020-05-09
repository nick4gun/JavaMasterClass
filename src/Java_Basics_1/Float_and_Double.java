package Java_Basics_1;

public class Float_and_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatVlaue = Float.MAX_VALUE;
		System.out.println("Float minimum Value = " + myMinFloatValue);
		System.out.println("Float maximum Value = " + myMaxFloatVlaue);

		double myMindoubleValue = Double.MIN_VALUE;
		double myMaxdoubleVlaue = Double.MAX_VALUE;
		System.out.println("double minimum Value = " + myMindoubleValue);
		System.out.println("double maximum Value = " + myMaxdoubleVlaue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3d;

		System.out.println("My Int Value = " + myIntValue);
		System.out.println("My Float Value = " + myFloatValue);
		System.out.println("My Double Value = " + myDoubleValue);

		// Convert pounds into Kilograms

		double numberOFPounds = 150;
		double convertedKilograms = numberOFPounds * 0.45359237;
		System.out.println("Weight in Kliogram = " + convertedKilograms);

		double pi = 3.1415927d;
		System.out.println("PI = " + pi);
	}

}
