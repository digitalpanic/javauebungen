package uebungsblatt3.uebung5;

public class Uebung5 {

	public static void main(String[] args) {

		Hochschulperson5 personobject = new Hochschulperson5("Hochschule München", "Harald Lesch", Ort.Dortmund, "Pelargonienweg", "52", 81377);
		//System.out.println(personobject.ermittleZugehoerigkeit());
		
		
		Professor5 professorobject = new Professor5("Hochschule München", "Harald Lesch", Ort.Dortmund, "Pelargonienweg", "52", 81377, "Fakultaet 07");
		System.out.println(professorobject.getDetails()+"\n"+professorobject.ermittleZugehoerigkeit());
		
		Student5 studentobject = new Student5("LMU", "Elite - Student", Ort.Muenchen, "Knorrstraße", "54", 80806, Studiengruppe.IB4C);
		System.out.println(studentobject.getDetails()+"\n"+studentobject.ermittleZugehoerigkeit());
		
		
	}

}
