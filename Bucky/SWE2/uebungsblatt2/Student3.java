package uebungsblatt2;


public class Student3 {

	public String fullName;
	Studiengruppe studiengruppe;
	Ort wohnort;
	public Adresse3 adr;
	
	
	public Student3(String str, String hausnr, int plz, Ort ort,String fullNamestudent, 
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
	
	
	
	public void getDetails(){
		
		//getDetails muss geändert werden es darf nur getter enthalten und 
		//return ort+name usw. 
		//die systemoutprintln darf im getDetails nicht stattfinden
        //
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