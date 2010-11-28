package de.leicheronline.java.bucky.intermediate.tutorial01;

public class Flori {
	public static void main (String args[]){
		
		String[] words = {"funk", "chunk", "furry", "baconator"};
		
		//StartsWith
		for(String w : words){
			if(w.startsWith("fu"))
				System.out.println(w + " statrs with fu");
		}
		//Ends with
		System.out.println();
		for(String w : words){
			if(w.endsWith("unk"))
				System.out.println(w + " ends with unk");
		}
		
	}

}
