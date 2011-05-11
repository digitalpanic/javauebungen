package uebungsblatt3.uebung5;

abstract class Hochschulperson5_ABC implements Person {
	
	private String hochschule;
	protected String fullName;
	protected Ort wohnort;
	protected Adresse5 adr;
	
	protected Hochschulperson5_ABC (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		this.wohnort = wohnort;
		adr = new Adresse5(strasse, hausnummer, plz, wohnort.toString()); 
		
	}
	protected abstract String getDetails();
	
	public String ermittleZugehoerigkeit() {
		return hochschule;
	}
}