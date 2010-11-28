package de.leicheronline.java.bucky.tutorial016;

public class tuna {
	private String girlName;
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("Deine liebe Freundin heisst %s",getName());
	}

}
