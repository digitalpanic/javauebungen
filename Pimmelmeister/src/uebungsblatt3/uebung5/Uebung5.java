package uebungsblatt3.uebung5;

public class Uebung5 {

	public static void main(String[] args) {
		System.out.println("Test der Person mit getDetails und Typecast: ");
		Person personobject = new Hochschulperson5("Hochschule München", "Harald Lesch", Ort.Dortmund, "Pelargonienweg", "52", 81377);
		System.out.println(personobject.ermittleZugehoerigkeit());
		if (personobject instanceof Hochschulperson5)
		{
		System.out.println(((Hochschulperson5) personobject).getDetails());
		}
		System.out.println("*************************************************");
		Hochschulperson5 professorobject = new Professor5("Hochschule München", "Harald Lesch", Ort.Dortmund, "Pelargonienweg", "52", 81377, "Fakultaet 07");
		System.out.println(professorobject.getDetails()+"\n"+professorobject.ermittleZugehoerigkeit());
		System.out.println("*************************************************");
		Hochschulperson5 studentobject = new Student5("LMU", "Elite - Student", Ort.Muenchen, "Knorrstraße", "54", 80806, Studiengruppe.IB4C);
		System.out.println(studentobject.getDetails()+"\n"+studentobject.ermittleZugehoerigkeit());
		
}
}
