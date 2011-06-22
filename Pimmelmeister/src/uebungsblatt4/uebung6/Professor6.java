package uebungsblatt4.uebung6;

public class Professor6 extends Hochschulperson6 {

	private String fakultaet;
//Konstruktor mit Adresse	
	public Professor6(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, String fakultaet) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.fakultaet = fakultaet;
		
	}
//einfacher Konstruktor ohne Adresse
	public Professor6(String hochschule, String fullName, String fakultaet){
	super(hochschule, fullName);
	this.fakultaet = fakultaet;
	}
//Prüfung der isSame Methode für Professor da diese Klasse von Hochschulperson erbt muss diese mit getFakultät überladen werden.
	public boolean isSame(Professor6 x){
		return (super.isSame(x)&&getFakultaet().equals(x.getFakultaet()));
		}

//Methode zur Rückgabe in Abhängigkeit des Vorhandensein einer Adresse
	public String getDetails() {
	return super.getDetails() + "\n" + getFakultaet();
		
}
//Methode zur Rückgabe aller Werte ohne Adresse
	public String ermittleZugehoerigkeit(){
		return super.ermittleZugehoerigkeit()+ "\n" + getFakultaet();
	}
	//redefinierte Methode clone() für Student6
	public Professor6 clone() throws CloneNotSupportedException {
		Professor6 copy = (Professor6)super.clone();
		return copy;
	}
	//getter und Setter Methoden
	public String getFakultaet() {
		return fakultaet;
	}

	public void setFakultaet(String fakultaet) {
		this.fakultaet = fakultaet;
	}
	
	
}