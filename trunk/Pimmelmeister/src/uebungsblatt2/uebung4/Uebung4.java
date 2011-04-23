package uebungsblatt2.uebung4;

import uebungsblatt2.uebung3.Ort;
import uebungsblatt2.uebung3.Studiengruppe;

public class Uebung4 {

	public static void main(String[] args) {

		Student4 studentobject = new Student4("Kirchweg", "6", 81377, Ort.Muenchen, "Peter Silie", Studiengruppe.IB4C);
		
		System.out.println(studentobject.ermittleZugehoerigkeit());
				
		Professor4 professorobject = new Professor4("Harald Lesch", "Fakultät 07");
		
		System.out.println(professorobject.ermittleZugehoerigkeit());
	}

}
