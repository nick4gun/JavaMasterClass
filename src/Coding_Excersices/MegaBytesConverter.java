package Coding_Excersices;

public class MegaBytesConverter {
	public static void main(String[] args) {

		printMegaByteAndKiloBytes(100000);

	}

	public static void printMegaByteAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int YY = (kiloBytes / 1024);
			int ZZ = (kiloBytes % 1024);
			System.out.println(kiloBytes + " KB = " + YY + "MB and " + ZZ + " KB");

		}

	}

}
