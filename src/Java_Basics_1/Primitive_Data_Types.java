package Java_Basics_1;

public class Primitive_Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primitive Data types

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Min Value = " + myMinIntValue);
		System.out.println("Integer MAx Value = " + myMaxIntValue);
		System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
		System.out.println("Busted Min Value = " + (myMinIntValue - 1));

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Min Value = " + myMinByteValue);
		System.out.println("Byte Max Value = " + myMaxByteValue);

		Short myMinShortValue = Short.MIN_VALUE;
		Short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Min Value = " + myMinShortValue);
		System.out.println("Short Max Value = " + myMaxShortValue);

		Long myMinLongValue = Long.MIN_VALUE;
		Long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Min Value = " + myMinLongValue);
		System.out.println("Long Max Value = " + myMaxLongValue);

		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		short myNewShortValue = (short) (myMinShortValue / 2);

		System.out.println(myTotal);
		System.out.println(myNewByteValue);
		System.out.println(myNewShortValue);

		byte byteValue = 98;
		short shortValue = 30796;
		int intValue = 486514;
		long long_Value = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println("Total " + long_Value);

	}

}
