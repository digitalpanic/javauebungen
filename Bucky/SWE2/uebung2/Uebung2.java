package uebung2;
import java.util.StringTokenizer;


public class Uebung2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 Studentobject = new Student2("Ernst-Kuzorra-Weg", "1", 45891, "Gelsenkirchen", "Raul Gonzales Blanco", "IBB2B");
		Studentobject.getDetails();
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
