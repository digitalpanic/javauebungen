package de.leicheronline.java.bucky.tutorial034;
// nochmal ansehen 34
class apples {

	public static void main(String[] args) {
		int firtarray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		int secondarray[][] = { { 30, 31, 32, 33 }, { 43 }, { 4, 5, 6 } };

		System.out.println("erstes Array");
		display(firtarray);
		System.out.println("");
		System.out.println("zweites Array");
		display(secondarray);
		
	}
	
	public static void display(int x[][]){
		for(int row=0;row<x.length;row++){
			for(int column=0;column<x[row].length;column++){
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
		}
	}
}
