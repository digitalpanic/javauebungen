package de.leicheronline.java.bucky.tutorial029;

class apples {
	public static void main(String[] args) {
		int flo[]={21,16,86,3,21};
		int sum=0;
		
		for(int counter=0;counter<flo.length;counter++){
			sum+=flo[counter];
		}
		System.out.println("Die Summe von diesen Zahlen ist " + sum);
	}

}
