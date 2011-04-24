package uebungsblatt3.uebung5;
import uebungsblatt2.uebung3.*;

public class Professor5 implements Person{

	public String fullName;
	public String fakultaet;
	public Ort wohnort;
	public Adresse5 adr;

	public Professor5(String str, String hausnr, int plz, Ort ort, String fullName, 
			String faculty){
	
	this.fullName = fullName;
	fakultaet = faculty;
	wohnort = ort;
	adr = new Adresse5(str, hausnr, plz, ort.toString());
	}
//Kopierkonstruktor
	public Professor5(Professor5 copy){
	wohnort = copy.wohnort;
	adr = copy.adr;
	fullName = copy.fullName;
	fakultaet = copy.fakultaet;
		}
	
	public Professor5(String fullName, String faculty){
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