package uebungsblatt5.uebung7;

public class Hochschulperson7 implements Person, Cloneable {
	
	private String hochschule;
	protected String fullName;
	protected Adresse7 adr;

	//Konstruktor ohne Adresse	
	protected Hochschulperson7 (String hochschule, String fullName) throws NullPointerException
	{
		if (fullName != null) {
		
		this.fullName = fullName;
		this.hochschule = hochschule;	
		}else { 
			
		}
		
		
	}
	
//Konstruktor mit Adresse
	protected Hochschulperson7 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		try {
			this.fullName = fullName;
		} catch (NullPointerException e) {
			System.out.println("Es wurde kein Name eingegeben!");	
		}		
		this.hochschule = hochschule;
		adr = new Adresse7(strasse, hausnummer, plz, wohnort.toString());
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
	public boolean isSame(Hochschulperson7 hp){
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
	public Hochschulperson7 clone() throws CloneNotSupportedException {
		Hochschulperson7 copy = (Hochschulperson7)super.clone();
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
	public Adresse7 getAdr() {
		return adr;
	}
	public void setHochschule(String hochschule) {
		this.hochschule = hochschule;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setAdr(Adresse7 adr) {
		this.adr = adr;
	}
}