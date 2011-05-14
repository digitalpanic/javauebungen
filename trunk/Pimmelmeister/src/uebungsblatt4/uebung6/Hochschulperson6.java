package uebungsblatt4.uebung6;

public class Hochschulperson6 implements Person {
	
	private String hochschule;
	protected String fullName;
	protected Ort wohnort;
	protected Adresse6 adr;
	
	protected Hochschulperson6 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		this.wohnort = wohnort;
		adr = new Adresse6(strasse, hausnummer, plz, wohnort.toString()); 
		
	}
	
	public String ermittleZugehoerigkeit() {
		
		return hochschule;
	}
	
	public String getDetails() {
		if (adr == null){
			return fullName;
		}else {
		return fullName +  "\n" + adr;
		
	}
	
	}

	public boolean isSame(Hochschulperson6 hp){
	if (getHochschule().equals(hp.getHochschule())&&getFullName().equals(hp.getFullName())&&adr.equals(hp.adr)){
		return true;
	}else{
		return false;
	}
	}
	
	public String getHochschule() {
		return hochschule;
	}

	public String getFullName() {
		return fullName;
	}

	public Ort getWohnort() {
		return wohnort;
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

	public void setWohnort(Ort wohnort) {
		this.wohnort = wohnort;
	}

	public void setAdr(Adresse6 adr) {
		this.adr = adr;
	}
}

