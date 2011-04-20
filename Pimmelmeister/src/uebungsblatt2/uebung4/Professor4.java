package uebungsblatt2.uebung4;
import uebungsblatt2.uebung3.*;

public class Professor4 {

	public String fullName;
	public String fakultaet;
	public Ort wohnort;
	public Adresse4 adr;

	public Professor4(String str, String hausnr, int plz, Ort ort, String fullNamestudent, 
			String fakult ){
	
	fullName = fullNamestudent;
	fakultaet = fakult;
	wohnort = ort;
	adr = new Adresse4(str, hausnr, plz, ort.toString());
	}
	//Kopierkonstruktor
	public Professor4(Professor4 copy){
		fullName = copy.fullName;
		fakultaet = copy.fakultaet;
		wohnort = copy.wohnort;
		adr = copy.adr;
	}
	
	public Professor4(String fullNamestudent, String fakult){
	fullName = fullNamestudent;
	fakultaet = fakult;
	
	}
	
	public String getDetails(){
	
	if (adr == null){
			return fullName + " " + fakultaet;
		}else {
		return fullName +  "\n" + adr + "\n" + fakultaet;
		}
	}	
}