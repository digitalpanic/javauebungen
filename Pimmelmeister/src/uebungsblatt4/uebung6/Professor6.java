package uebungsblatt4.uebung6;
import uebungsblatt2.uebung3.*;

public class Professor6 extends Hochschulperson6 {

	private String fakultaet;
	
	public Professor6(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, String fakultaet) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.fakultaet = fakultaet;
		
	}
	
	public String getDetails() {
	return super.getDetails() + "\n" + fakultaet;
		
}

	public String getFakultaet() {
		return fakultaet;
	}

	public void setFakultaet(String fakultaet) {
		this.fakultaet = fakultaet;
	}
	
	
}