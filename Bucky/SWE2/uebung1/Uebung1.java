package uebungsblatt1.uebung1;
import java.util.StringTokenizer;


public class Uebung1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 Studentobject = new Student1("Ernst-Kuzorra-Weg", "1", 45891, "Gelsenkirchen", "Raul Gonzales Blanco", "IBB2B");
		Studentobject.getDetails();
		Student1 Studentobject2 = new Student1("Ernest Hemingway", "IBB6B");
		Studentobject2.getDetails();
		//Vollständiger Name in String ablegen
		String fullname = Studentobject.fullName.toString();
		//Studiengruppe in String ablegen
		String studiengruppe = Studentobject.studiengruppe.toString();
		
		StringTokenizer st = new StringTokenizer(fullname, " ");
		StringTokenizer st2 = new StringTokenizer(studiengruppe);
		
		System.out.println("Vollständiger Name: ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}   
		System.out.println("Studiengruppe: ");
		System.out.println(st2.nextToken());
		
	}

}
