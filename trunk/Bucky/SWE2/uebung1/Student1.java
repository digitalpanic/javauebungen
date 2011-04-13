package SEII.src.uebung1;


public class Student1 {

	public String fullName;
	public String studiengruppe;
	public adress1 adr;
	
	
	public Student1(String str, String hausnr, int plz, String wohnort,String fullNamestudent, String studygroup ){
	
	fullName = fullNamestudent;
	studiengruppe = studygroup;
	adr = new adress1(str, hausnr, plz, wohnort);
	}
	
	public Student1(String fullNamestudent, String studygroup){
	fullName = fullNamestudent;
	studiengruppe = studygroup;
	
	}
	
	
	
	public void getDetails(){
		if (adr == null){
			System.out.println("Vollständiger Name: " + "\n" + fullName);
			System.out.println("Studiengruppe: " + "\n" + studiengruppe);	
		}else {
		System.out.println("Vollständiger Name: " + "\n" + fullName);
		System.out.println(adr.toString());
		System.out.println("Studiengruppe: " + "\n" + studiengruppe);
		}
	}
	
}
