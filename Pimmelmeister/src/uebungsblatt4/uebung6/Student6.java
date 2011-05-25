package uebungsblatt4.uebung6;

public class Student6 extends Hochschulperson6  {

	private Studiengruppe studiengruppe;

	public Student6(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, Studiengruppe studiengruppe) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.studiengruppe = studiengruppe;
	}
	public Student6(String hochschule, String fullName, Studiengruppe studiengruppe){
		super(hochschule, fullName);
		this.studiengruppe = studiengruppe;
	}
//Methode zur Rückgabe in Abhängigkeit einer evtl. vorhandenen Adresse	
	public String getDetails(){
	return super.getDetails() + "\n" + studiengruppe;
	}
//Methode zur Rückgabe aller Werte ohne Adresse unabhängig davon ob Adresse vorhanden oder nicht	
	public String ermittleZugehoerigkeit(){
		return super.ermittleZugehoerigkeit() + "\n" + getStudiengruppe();
	}
	//Prüfung der isSame Methode für Student da diese Klasse von Hochschulperson erbt muss diese mit getStudiengruppe überladen werden.	
	public boolean isSame(Student6 x){
		if(super.isSame(x)&&getStudiengruppe().equals(x.getStudiengruppe())){
		return true;
	}else{
		return false;
	}}
//getter und Setter Methoden
	public Studiengruppe getStudiengruppe() {
		return studiengruppe;
	}

	public void setStudiengruppe(Studiengruppe studiengruppe) {
		this.studiengruppe = studiengruppe;
	}

}