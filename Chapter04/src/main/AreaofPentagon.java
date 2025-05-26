package main;

import java.text.DecimalFormat;
import java.util.*;

public class AreaofPentagon {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scanner = new Scanner(System.in);
		
		//r is the length from the center to a vertex
		System.out.println("Enter the length from the center to a vertex: ");
		double r = scanner.nextDouble();
		
		//s is the length of a side
		double s = (2*r)*(Math.sin(Math.PI/5));
		
		double area = ((5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI/5))));
		
		System.out.println("The area of the pentagon is " + df.format(area));
		
		scanner.close();
		
	}

}
