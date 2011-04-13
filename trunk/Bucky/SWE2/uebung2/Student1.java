package SEII.src.uebung2;



public class Student1 extends adress1 {

	public String fullName;
	public String studiengruppe;
	
	
	
	public Student1(String str, String hausnr, int plz, String wohnort,String fullNamestudent, String studygroup ){
	super(str, hausnr, plz, wohnort);
	fullName = fullNamestudent;
	studiengruppe = studygroup;
	
	
	}
	
	public void getDetails(){
		System.out.println("Vollständiger Name: " + "\n" + fullName);
		System.out.println(super.toString());
		System.out.println("Studiengruppe: " + "\n" + studiengruppe);
	
	}
	
}
