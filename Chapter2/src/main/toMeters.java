package main;

import java.util.*;


//Converting feet into meters
public class toMeters {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value for feet: ");
		double feet = scanner.nextDouble();
		
		double meters = (feet * 0.305);
		
		System.out.println(feet + " feet is " + meters + " meters");
	}

}
