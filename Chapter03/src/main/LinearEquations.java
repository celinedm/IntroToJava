package main;

import java.util.*;

public class LinearEquations {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		
		//Cramer's Rule
		double dom = (a*d) - (b*c);
		
		double numX = (e*d) - (b*f);
		double x = numX / dom;
		
		double numY = (a*f) - (e*c);
		double y = numY / dom;
		
		if(dom == 0) {
			System.out.println(
					"The equation has no solution");
		}else {
				System.out.println(
						"X is " + x + " and y is " + y);
		}
		
		
		scanner.close();
		
		 
	}
}
