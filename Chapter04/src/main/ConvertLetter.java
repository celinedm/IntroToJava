package main;

import java.util.*;

public class ConvertLetter {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		
		String grade = scanner.next().toUpperCase();
		
		switch(grade) {
		
		case "A":
			System.out.println("The numeric value for grade " + grade + " is 4");
			break;
		
		case "B":
			System.out.println("The numeric value for grade " + grade + " is 3");
			break;
			
		case "C":
			System.out.println("The numeric value for grade " + grade + " is 2");
			break;
			
		case "D":
			System.out.println("The numeric value for grade " + grade + " is 1");
			break;
			
		case "F":
			System.out.println("The numeric value for grade " + grade + " is 0");
			break;
			
		default:
			System.out.println(grade + " is not a valid letter grade.");
			
		}
		scanner.close();
	}

}
