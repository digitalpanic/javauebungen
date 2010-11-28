package de.leicheronline.java.bucky.tutorial032;

class aples {
	public static void main(String[] args) {
		int flo[] = { 3, 4, 5, 6, 7 };
		change(flo);
		
		for(int y:flo)
			System.out.println(y);
		

	}
	public static void change(int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
		
	}

}
