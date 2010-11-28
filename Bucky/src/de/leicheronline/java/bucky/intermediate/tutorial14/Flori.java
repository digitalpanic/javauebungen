package de.leicheronline.java.bucky.intermediate.tutorial14;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);

		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
			
		
	}

	private static void printStack(Stack<String> s) {
		if(s.isEmpty())
			System.out.println("Es ist nichts im Stack");
		else
			System.out.printf("%s TOP\n",s);
		
	}

}
