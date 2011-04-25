package uebungsblatt2.uebung4;
import uebungsblatt2.uebung3.*;

public class Professor4 implements Person{

	private String fullName;
	private String fakultaet;
	private Ort wohnort;
	private Adresse4 adr;

	public Professor4(String str, String hausnr, int plz, Ort ort, String fullName, 
			String faculty){
	
	this.fullName = fullName;
	fakultaet = faculty;
	wohnort = ort;
	adr = new Adresse4(str, hausnr, plz, ort.toString());
	}
//Kopierkonstruktor
	public Professor4(Professor4 copy){
	wohnort = copy.wohnort;
	adr = copy.adr;
	fullName = copy.fullName;
	fakultaet = copy.fakultaet;
		}
	
	public Professor4(String fullName, String faculty){
	this.fullName = fullName;
	fakultaet = faculty;
	}

	public String ermittleZugehoerigkeit() {
		if (adr == null){
			return fullName + "\n" + fakultaet;
		}else {
		return fullName +  "\n" + adr + "\n" + fakultaet;
		}
	}	
}