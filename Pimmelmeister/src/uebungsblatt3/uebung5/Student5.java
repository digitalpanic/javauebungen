package uebungsblatt3.uebung5;
import uebungsblatt2.uebung3.*;

public class Student5 extends Hochschulperson5{

	public Studiengruppe studiengruppe;

	public Student5(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, Studiengruppe studiengruppe) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.studiengruppe = studiengruppe;
	}
	
	public String ermittleZugehoerigkeit(){
	
	if (adr == null){
			return fullName + " " +studiengruppe + "\n" + super.ermittleZugehoerigkeit();
		}else {
		return fullName +  "\n" + adr + "\n" + studiengruppe + "\n" +super.ermittleZugehoerigkeit();
		}
	}	
}