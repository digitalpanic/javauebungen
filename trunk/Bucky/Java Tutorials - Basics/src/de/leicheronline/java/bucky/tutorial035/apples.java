package de.leicheronline.java.bucky.tutorial035;

class apples {
	public static void main(String[] args) {
		System.out.println(average(32,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,123,123,123125234,2134123,123,123,5131,1234,123,123,4124));
	}
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
}
