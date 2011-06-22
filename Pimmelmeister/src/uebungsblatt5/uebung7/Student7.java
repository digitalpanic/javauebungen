package uebungsblatt5.uebung7;

public class Student7 extends Hochschulperson7 implements Cloneable {

	private Studiengruppe studiengruppe;

	public Student7(String hochschule, String fullName, Studiengruppe studiengruppe) throws Exception{
		super(hochschule, fullName);
		this.studiengruppe = studiengruppe;
	}
	
	public Student7(String hochschule, String fullName, Ort wohnort,
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
	public boolean isSame(Student7 x){
		return (super.isSame(x)&&getStudiengruppe().equals(x.getStudiengruppe()));
	}
	
	
	//redefinierte Methode clone() für Student6
	public Student7 clone() throws CloneNotSupportedException {
		Student7 copy = (Student7)super.clone();
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