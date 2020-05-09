package Coding_Excersices;

public class Area_Calculator {

	public static void main(String[] args) {

		System.out.println(area(5.5));
		System.out.println(area(-1.0, 4.0));
	}

	public static double area(double radius) {
		if (radius < 0) {
			return -1.0;
		}
		double areaOfCircle = radius * radius * Math.PI;
		return areaOfCircle;
	}

	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			return -1.0;
		}
		double areaOfRectangle = x * y;
		return areaOfRectangle;
	}

}
