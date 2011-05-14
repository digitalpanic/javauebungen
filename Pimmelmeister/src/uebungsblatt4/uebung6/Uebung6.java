package uebungsblatt4.uebung6;

public class Uebung6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hochschulperson6 test = new Hochschulperson6("Hochschule München", "Professor Schlau Schlau", Ort.Hamburg, "Waldweg", "7a", 80806);
		Hochschulperson6 test2 = new Hochschulperson6 ("Hochschule München", "Professor Schlau Schlau", Ort.Hamburg, "Waldweg", "7a", 80806);
		System.out.println(test.isSame(test2));
		System.out.println(test.adr.equals(test2.adr));
		Student6 student1 = new Student6("Hochschule München", "Student 1", Ort.Muenchen, "Kurzweg", "1a", 81377, Studiengruppe.IB4B);
		Student6 student2 = new Student6("Hochschule München", "Student 1", Ort.Muenchen, "Kurzweg", "1a", 81377, Studiengruppe.IB4B);
		System.out.println(student1.isSame(student2));
		
	}

}
