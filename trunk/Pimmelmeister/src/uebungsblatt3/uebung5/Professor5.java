package uebungsblatt3.uebung5;
import uebungsblatt2.uebung3.*;

public class Professor5 extends Hochschulperson5 {

	public String fakultaet;
	
	
	public Professor5(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, String fakultaet) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.fakultaet = fakultaet;
		
	}

	public String ermittleZugehoerigkeit() {
		if (adr == null){
			return fullName + "\n" + fakultaet + "\n" + super.ermittleZugehoerigkeit();
		}else {
		return fullName +  "\n" + adr + "\n" + fakultaet + "\n" + super.ermittleZugehoerigkeit();
		}
	}	
}