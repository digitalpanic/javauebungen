package uebungsblatt2.uebung3;
import java.util.StringTokenizer;

public class Uebung3 {
	
	public static void main(String[] args) {
		
		Student3 Studentobject = new Student3("Ernst-Kuzorra-Weg", "1", 45891, Ort.Gelsenkirchen, "Raul Gonzales Blanco", Studiengruppe.IB2B);
		
		System.out.println(Studentobject.getDetails());
		
	/**	StringTokenizer st = new StringTokenizer(Studentobject.fullName.toString(), " ");
		StringTokenizer st2 = new StringTokenizer(Studentobject.studiengruppe.toString());
		
		System.out.println("Vollständiger Name: ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}   
		System.out.println("Studiengruppe: ");
		System.out.println(st2.nextToken());	
	*/}
}
