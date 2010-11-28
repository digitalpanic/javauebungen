package de.leicheronline.java.bucky.tutorial037;

class apples {
	public static void main(String[] args) {
		tuna tunaObject = new tuna();
		System.out.println("Default DE");
		System.out.println(tunaObject.toGerman());
		System.out.println("Default US");
		System.out.println(tunaObject.toUS());
		System.out.println();
		tunaObject.setTime(15, 27, 6);
		System.out.println("DE");
		System.out.println(tunaObject.toGerman());
		System.out.println("US");
		System.out.println(tunaObject.toUS());
	}

}
