package uebungsblatt3.uebung5;

public class Hochschulperson5 implements Person {
	
	private String hochschule;
	protected String fullName;
	protected Ort wohnort;
	protected Adresse5 adr;
	
	protected Hochschulperson5 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		this.wohnort = wohnort;
		adr = new Adresse5(strasse, hausnummer, plz, wohnort.toString()); 
		
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
}

