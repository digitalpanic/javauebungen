package de.leicheronline.java.bucky.tutorial044;

public enum tuna {
	flo("nice", "85"),
	jessi("süss", "86"),
	simon("saufer", "84");
	
	private final String desc;
	private final String year;
	
	tuna(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
	
	
}
