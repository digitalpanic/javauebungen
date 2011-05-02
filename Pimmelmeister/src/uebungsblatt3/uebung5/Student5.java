package uebungsblatt3.uebung5;
import uebungsblatt2.uebung3.*;

public class Student5 extends Hochschulperson5  {

	private Studiengruppe studiengruppe;

	public Student5(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, Studiengruppe studiengruppe) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.studiengruppe = studiengruppe;
	}
	
	public String getDetails(){
	
	if (adr == null){
			return fullName + " " +studiengruppe;
		}else {
		return fullName +  "\n" + adr + "\n" + studiengruppe;
		}
	}

}