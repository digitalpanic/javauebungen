package uebungsblatt2.uebung3;
import java.util.StringTokenizer;

public class Uebung3 {
	
	public static void main(String[] args) {
		
		Student3 Studentobject = new Student3("Ernst-Kuzorra-Weg", "1", 45891, Ort.Gelsenkirchen, "Raul Gonzales Blanco", Studiengruppe.IB2B);
//Testen des Kopierkonstruktors
		Student3 Studentobjectcopy = new Student3(Studentobject);
		System.out.println("Kopiertes Studentenobjekt: \n"+Studentobjectcopy.getDetails());
		System.out.println("Original Studentenobjekt: \n"+Studentobject.getDetails());
		System.out.println("Prüfen ob dasselbe Objekt \n"+Studentobject.equals(Studentobjectcopy));
	
//Testen des Kopierkonstruktors ohne Adresse
		Student3 bucky = new Student3 ("Ralf Hufenstuhl", Studiengruppe.IB4B);
		Student3 buckycopy = new Student3 (bucky);
		System.out.println("Original Studentenobjekt: \n"+bucky.getDetails());
		System.out.println("Kopiertes Studentenobjekt: \n"+buckycopy.getDetails());
		System.out.println("Prüfen ob dasselbe Objekt: \n"+bucky.equals(buckycopy));

//Testen des StrinkTokenizers
		
		StringTokenizer st = new StringTokenizer(Studentobject.fullName.toString());
		StringTokenizer st2 = new StringTokenizer(Studentobject.studiengruppe.toString());
		
		System.out.println("Vollständiger Name: ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}   
		System.out.println("Studiengruppe: ");
		System.out.println(st2.nextToken());	
	}
}
