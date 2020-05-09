package OOPs_Concepts;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator calc = new SimpleCalculator();
		calc.setFirstNumber(7.0);
		calc.setSecondNumber(4.0);
		System.out.println("Add = " + calc.getAdditionResult());
		System.out.println("Subtract = " + calc.getSubtractionResult());
		calc.setFirstNumber(12.25);
		calc.setSecondNumber(6.0);
		System.out.println("Multiply = " + calc.getMultiplicationResult());
		System.out.println("Division = " + calc.getDivisonResult());
	}

}
