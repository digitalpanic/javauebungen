package uebungsblatt4.uebung6;

public class Hochschulperson6 implements Person, Cloneable {
	
	private String hochschule;
	protected String fullName;
	protected Adresse6 adr;

	//Konstruktor ohne Adresse	
	protected Hochschulperson6 (String hochschule, String fullName)
	{
	this.hochschule = hochschule;
	this.fullName = fullName;
	}
//Konstruktor mit Adresse
	protected Hochschulperson6 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		adr = new Adresse6(strasse, hausnummer, plz, wohnort.toString());
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
//Methode isSame() von Hochschulperson6 mittels getterMethoden in Abhängigkeit von einer vorhandenen Adresse
	public boolean isSame(Hochschulperson6 hp){
	boolean adrcheck = false;
		if ((hp==null) || (this.getClass() != hp.getClass()))
		return false;
		
		if (getAdr() == null){
			adrcheck = hp.getAdr() == null;
		}	else {
			adrcheck = (getAdr().equals(hp.getAdr()));
		}
		return( 
		adrcheck &&
		getHochschule().equals(hp.getHochschule())&&
		getFullName().equals(hp.getFullName())
		);
	}
	//redefinierte Methode clone für Hochschulperson6
	public Hochschulperson6 clone() throws CloneNotSupportedException {
		Hochschulperson6 copy = (Hochschulperson6)super.clone();
		if (adr != null){
		copy.adr = adr.clone();}
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