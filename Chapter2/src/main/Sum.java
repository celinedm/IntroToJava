package main;

import java.util.*;

//Sum the digits of an integer

public class Sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 1000");
		
		int number = input.nextInt();
		
		int ones = number % 10;
		number /= 10;
		
		int tens = number % 10;
		number /= 10;
		
		int hundreds = number % 10;
		number /= 10;
		
		int thousands = number % 10;
		number /= 10;
		
		int sum = thousands + hundreds + tens + ones;
		
		System.out.println("The sum of the digits is " + sum);
	}

}
