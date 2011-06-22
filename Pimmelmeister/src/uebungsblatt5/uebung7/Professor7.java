package uebungsblatt5.uebung7;

public class Professor7 extends Hochschulperson7 {

	private String fakultaet;
//Konstruktor mit Adresse	
	public Professor7(String hochschule, String fullName, Ort wohnort,
			String strasse, String hausnummer, int plz, String fakultaet) {
		super(hochschule, fullName, wohnort, strasse, hausnummer, plz);
		this.fakultaet = fakultaet;
		
	}
//einfacher Konstruktor ohne Adresse
	public Professor7(String hochschule, String fullName, String fakultaet) throws Exception{
	super(hochschule, fullName);
	this.fakultaet = fakultaet;
	}
//Prüfung der isSame Methode für Professor da diese Klasse von Hochschulperson erbt muss diese mit getFakultät überladen werden.
	public boolean isSame(Professor7 x){
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
	public Professor7 clone() throws CloneNotSupportedException {
		Professor7 copy = (Professor7)super.clone();
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