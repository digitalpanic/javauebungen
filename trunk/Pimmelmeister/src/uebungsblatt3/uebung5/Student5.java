package uebungsblatt3.uebung5;
import uebungsblatt2.uebung3.*;

public class Student5 implements Person{

	public String fullName;
	public Studiengruppe studiengruppe;
	public Ort wohnort;
	public Adresse5 adr;

	public Student5(String str, String hausnr, int plz, Ort ort, String fullNamestudent, 
			Studiengruppe sg ){
	
	fullName = fullNamestudent;
	studiengruppe = sg;
	wohnort = ort;
	adr = new Adresse5(str, hausnr, plz, ort.toString());
	}
	//Kopierkonstruktor
	public Student5(Student5 copy){
	wohnort = copy.wohnort;
	adr = copy.adr;
	fullName = copy.fullName;
	studiengruppe = copy.studiengruppe;
		}
	
	public Student5(String fullNamestudent, Studiengruppe sg){
	fullName = fullNamestudent;
	studiengruppe = sg;
	}
	
	public String ermittleZugehoerigkeit(){
	
	if (adr == null){
			return fullName + " " +studiengruppe;
		}else {
		return fullName +  "\n" + adr + "\n" + studiengruppe;
		}
	}	
}