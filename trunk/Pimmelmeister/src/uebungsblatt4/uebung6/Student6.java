package uebungsblatt4.uebung6;

public class Student6 extends Hochschulperson6 implements Cloneable {

	private Studiengruppe studiengruppe;

	public Student6(String hochschule, String fullName, Studiengruppe studiengruppe){
		super(hochschule, fullName);
		this.studiengruppe = studiengruppe;
	}
	
	public Student6(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, Studiengruppe studiengruppe) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
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
		return (super.isSame(x)&&getStudiengruppe().equals(x.getStudiengruppe()));
	}
	
	
	//redefinierte Methode clone() für Student6
	public Student6 clone() throws CloneNotSupportedException {
		Student6 copy = (Student6)super.clone();
		return copy;
	}
	
//getter und Setter Methoden
	public Studiengruppe getStudiengruppe() {
		return studiengruppe;
	}

	public void setStudiengruppe(Studiengruppe studiengruppe) {
		this.studiengruppe = studiengruppe;
	}

}