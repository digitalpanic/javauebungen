package de.leicheronline.java.bucky.intermediate.tutorial19;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
		System.out.println(max(23,43,1));
		System.out.println();
		System.out.println(max("apples","toats","chicken"));
		
	}

	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T m = a;

		if (b.compareTo(a) > 0)
			m = b;

		if (c.compareTo(m) > 0)
			m = c;

		return m;
	}

}
