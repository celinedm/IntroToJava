package main;

import java.util.*;

//Solving quadratic equation

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a , b , c");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		if (discriminant > 0) {
			double r1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			double r2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
			
			System.out.println("The equation has two roots. " + r1 + " and " + r2);
			
		}else if(discriminant == 0) {
			
			double r = -b / (2 * a);
			System.out.println("The equation has one root. " + r);
			
		}else {
			System.out.println("The equation has no roots");
		}
		
		scanner.close();
	}
}
