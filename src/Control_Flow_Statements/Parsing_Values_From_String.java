package Control_Flow_Statements;

public class Parsing_Values_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numberAsString = "2018.234a";
		System.out.println("Number as String = " + numberAsString);

		double number = Double.parseDouble(numberAsString);
		System.out.println("nnumber = " + number);

		numberAsString += 1;
		number += 1;
		System.out.println(numberAsString);
		System.out.println(number);

	}

}
