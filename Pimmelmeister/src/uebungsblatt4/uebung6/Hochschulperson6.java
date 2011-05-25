package uebungsblatt4.uebung6;

public class Hochschulperson6 implements Person, Cloneable {
	
	private String hochschule;
	protected String fullName;
	protected Adresse6 adr;
	
//Konstruktor mit Adresse
	protected Hochschulperson6 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		adr = new Adresse6(strasse, hausnummer, plz, wohnort.toString());
	}
//Konstruktor ohne Adresse	
	protected Hochschulperson6 (String hochschule, String fullName)
	{
	this.hochschule = hochschule;
	this.fullName = fullName;
	}
		
	public String ermittleZugehoerigkeit() {
		
		return hochschule +  " " + fullName ;
	}
	public String getDetails() {
		if (adr == null){
			return fullName + " " +hochschule;
		}else {
		return fullName + " " + hochschule + "\n" + adr;	
	}
	}
//Methode isSame() von Hochschulperson6 mittels getterMethoden
	public boolean isSame(Hochschulperson6 hp){
	if (getHochschule().equals(hp.getHochschule())&&getFullName().equals(hp.getFullName())&&getAdr().equals(hp.getAdr())){
		return true;
	}else{
		return false;
	}
	}
	public Hochschulperson6 clone() throws CloneNotSupportedException {
		Hochschulperson6 copy = (Hochschulperson6)super.clone();
		copy.adr = adr.clone();
		return copy;
	}
//getter und Setter Methoden	
	public String getHochschule() {
		return hochschule;
	}
	public String getFullName() {
		return fullName;
	}
	public Adresse6 getAdr() {
		return adr;
	}
	public void setHochschule(String hochschule) {
		this.hochschule = hochschule;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setAdr(Adresse6 adr) {
		this.adr = adr;
	}
}