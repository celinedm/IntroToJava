package main;

import java.util.*;

public class UsingOperators {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int input = scanner.nextInt();
		
		boolean divisibleBy5 = input % 5 == 0;
		boolean divisibleBy6 = input % 6 == 0;
		
		System.out.println
			("Is " + input + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
		System.out.println
			("Is " + input + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
		System.out.println
			("Is " + input + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));
		
		scanner.close();
	}
}
