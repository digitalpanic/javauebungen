package de.leicheronline.java.bucky.tutorial018;

class Bucky {
	public static void main(String[] args) {
		Integer[] iray = { 1, 2, 3, 4, 5 };
		Character[] cray = { 'f', 'l', 'o', 'r', 'i' };

		printMe(iray);
		printMe(cray);

	}

	// Generische Methode
	public static <T> void printMe(T[] x) {
		for (T b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
