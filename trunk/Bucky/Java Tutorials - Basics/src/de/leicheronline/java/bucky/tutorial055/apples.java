package de.leicheronline.java.bucky.tutorial055;

public class apples {
	public static void main(String[] args) {

		food flo[] = new food[2];
		flo[0] = new potpie();
		flo[1] = new tuna();

		for (int x = 0; x < 2; ++x) {
			flo[x].eat();
		}
	}
}