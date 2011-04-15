package uebung2;



public class Student2 {

	public String fullName;
	public String studiengruppe;
	
	
	
	public Student2(String str, String hausnr, int plz, String wohnort,String fullNamestudent, String studygroup ){
	
	fullName = fullNamestudent;
	studiengruppe = studygroup;
	
	
	}
	
	public void getDetails(){
		System.out.println("Vollständiger Name: " + "\n" + fullName);
		System.out.println(super.toString());
		System.out.println("Studiengruppe: " + "\n" + studiengruppe);
	
	}
	
}
