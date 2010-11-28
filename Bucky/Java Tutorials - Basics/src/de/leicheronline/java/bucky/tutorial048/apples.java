package de.leicheronline.java.bucky.tutorial048;

public class apples {
	public static void main(String[] args) {
		tuna tunaObject = new tuna(19);

		for (int i = 0; i < 5; i++) {
			tunaObject.add();
			System.out.printf("%s", tunaObject);
		}

	}
}
