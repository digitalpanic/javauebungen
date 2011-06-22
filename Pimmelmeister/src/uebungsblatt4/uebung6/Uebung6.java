package uebungsblatt4.uebung6;

public class Uebung6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Hochschulperson6 test = new Hochschulperson6("Hochschule M�nchen", "Harald Lesch", Ort.Hamburg, "Waldweg", "7a", 80806);
		Hochschulperson6 test2 = new Hochschulperson6 ("Hochschule M�nchen", "Harald Lesch", Ort.Hamburg, "Waldweg", "7b", 80806);
		Hochschulperson6 test3 = new Hochschulperson6 ("Hochschule M�nchen", "Harald Lesch");
		Hochschulperson6 test4 = test3.clone();
		Hochschulperson6 test5 = test2.clone();
		System.out.println("*******Testen der Hochschulperson**********");
		System.out.println("Test5 enthält die gleichen Daten wie Test2: "+test5.isSame(test2));
		System.out.println("Test2 enthält die gleichen Daten wie Test: "+test2.isSame(test));
		System.out.println("Test3 enthält die gleichen Daten wie Test2: " +test2.isSame(test3));
		//Veränderung der Hochschule in Test2
		test2.setHochschule("Hochschule Bochum");
		System.out.println("Die Adresse in test entspricht der von test2: "+test.adr.equals(test2.adr));
		System.out.println("Test5 enthält die gleichen Daten wie Test2: "+test5.isSame(test2));
		System.out.println("*******Testen der Studentenklasse**********");
		Student6 student1 = new Student6("Hochschule München", "Student 1", Ort.Muenchen, "Kurzweg", "1a", 81377, Studiengruppe.IB4B);
		Student6 student2 = new Student6("Hochschule München", "Student 2", Ort.Hamburg, "Waldweg", "7a", 80806, Studiengruppe.IB4B);
		Student6 student3 = new Student6("Hochschule München", "Student 3", Studiengruppe.IB2B);
		Student6 student4 = student2.clone();
		Student6 student5 = student3.clone();
		System.out.println("Student5 enthält die gleichen Daten wie Student4: "+student5.isSame(student4));
		System.out.println("Student2 enthält die gleichen Daten wie Student1: "+student2.isSame(student1));
		System.out.println("Student4 enthält die gleichen Daten wie Student2: " +student4.isSame(student2));
		//Veränderung der Studiengruppe in Student2;
		student2.setStudiengruppe(Studiengruppe.IB4C);
		System.out.println("Student4 enthält die gleichen Daten wie Student2: "+student4.isSame(student2));
		System.out.println("Die Adresse in test entspricht der von Student2: "+test.adr.equals(student2.adr));
		System.out.println("Die Objekte Student2 und Test sind gleich: "+test.isSame(student2));
		System.out.println("*******Testen der Adresse**********");
		Adresse6 testadr = new Adresse6("Forstweg","3", 81377, "München");
		Adresse6 testadr2 = testadr.clone();
		System.out.println("Adresse testadr enthält die gleichen Daten wie testadr2 "+testadr.equals(testadr2));
		//Ort wird verändert
		testadr.setOrt("Bochum");
		System.out.println("Adresse testadr enthält die gleichen Daten wie testadr2 "+testadr.equals(testadr2));
	}

}
