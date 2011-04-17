package uebungsblatt2.uebung3;


public class Student3 {

	public String fullName;
	public Studiengruppe studiengruppe;
	public Ort wohnort;
	public Adresse3 adr;
	
	
	public Student3(String str, String hausnr, int plz, Ort ort, String fullNamestudent, 
			Studiengruppe sg ){
	
	fullName = fullNamestudent;
	studiengruppe = sg;
	wohnort = ort;
	adr = new Adresse3(str, hausnr, plz, ort.toString());
	}
	
	public Student3(String fullNamestudent, Studiengruppe sg){
	fullName = fullNamestudent;
	studiengruppe = sg;
	
	}
	
	public String getDetails(){
	
	if (adr == null){
			return fullName+studiengruppe;
		}else {
		return fullName+adr+studiengruppe;
		}
	}	
}