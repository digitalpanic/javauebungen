package uebungsblatt4.uebung6;
import uebungsblatt2.uebung3.*;

public class Student6 extends Hochschulperson6  {

	private Studiengruppe studiengruppe;

	public Student6(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, Studiengruppe studiengruppe) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.studiengruppe = studiengruppe;
	}
	
	public String getDetails(){
	return super.getDetails() + "\n" + studiengruppe;
	
	}
	
	public boolean isSame(Student6 x){
		if(super.isSame(x)&&studiengruppe.equals(x.studiengruppe)){
		return true;
	}else{
		return false;
	}}
	
	public Studiengruppe getStudiengruppe() {
		return studiengruppe;
	}

	public void setStudiengruppe(Studiengruppe studiengruppe) {
		this.studiengruppe = studiengruppe;
	}

}