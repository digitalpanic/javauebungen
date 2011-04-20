package uebungsblatt2.uebung4;
import uebungsblatt2.uebung3.*;

public class Student4 {

	public String fullName;
	public Studiengruppe studiengruppe;
	public Ort wohnort;
	public Adresse4 adr;

	public Student4(String str, String hausnr, int plz, Ort ort, String fullNamestudent, 
			Studiengruppe sg ){
	
	fullName = fullNamestudent;
	studiengruppe = sg;
	wohnort = ort;
	adr = new Adresse4(str, hausnr, plz, ort.toString());
	}
	//Kopierkonstruktor
	public Student4(Student4 copy){
		fullName = copy.fullName;
		studiengruppe = copy.studiengruppe;
		wohnort = copy.wohnort;
		adr = copy.adr;
	}
	
	public Student4(String fullNamestudent, Studiengruppe sg){
	fullName = fullNamestudent;
	studiengruppe = sg;
	
	}
	
	public String getDetails(){
	
	if (adr == null){
			return fullName + " " +studiengruppe;
		}else {
		return fullName +  "\n" + adr + "\n" + studiengruppe;
		}
	}	
}