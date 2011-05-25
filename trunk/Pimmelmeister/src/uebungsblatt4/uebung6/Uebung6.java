package uebungsblatt4.uebung6;

public class Uebung6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Hochschulperson6 test = new Hochschulperson6("Hochschule München", "Professor Schlau Schlau", Ort.Hamburg, "Waldweg", "7a", 80806);
		Hochschulperson6 test2 = new Hochschulperson6 ("Hochschule München", "Professor Schlau Schlau", Ort.Hamburg, "Waldweg", "7a", 80806);
		Hochschulperson6 test3 = new Hochschulperson6 ("Hochschule Freising", "Professor Lesch");
		Hochschulperson6 test4 = test2.clone();
		System.out.println(test.isSame(test2));
		System.out.println(test.adr.equals(test2.adr));
		System.out.println(test2.ermittleZugehoerigkeit());
		System.out.println(test3.getDetails());
		System.out.println(test2.getDetails());
		System.out.println("Das geklonte Objekt der HS Person: "+test4);
//		Student6 student1 = new Student6("Hochschule München", "Student 1", Ort.Muenchen, "Kurzweg", "1a", 81377, Studiengruppe.IB4B);
//		Student6 student2 = new Student6("Hochschule München", "Student 1", Ort.Hamburg, "Waldweg", "7a", 80806, Studiengruppe.IB4B);
//		Student6 student3 = new Student6("Hochschule München", "Student 3", Studiengruppe.IB2B);
//		System.out.println(student1.isSame(student2));
//		System.out.println(test.adr.equals(student2.adr));
//		System.out.println(student1.ermittleZugehoerigkeit());
//		System.out.println(student3.getDetails());
//		System.out.println("*************************");
//		Adresse6 testadr = new Adresse6("Forstweg","3", 81377, "München");
//		Adresse6 testadr2 = testadr.clone();
//		System.out.println(testadr);
//		testadr.setOrt("Bochum");
//		System.out.println(testadr2);
//		System.out.println(testadr);
	}

}
