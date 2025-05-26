package main;

import java.text.DecimalFormat;
import java.util.*;

public class AreaOfHexagon {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = scanner.nextDouble();
		
		double area = ((6 * Math.pow(side, 2))/
				(4 * Math.tan(Math.PI/6)));
		
		System.out.println("The area of a hexagon is " + df.format(area));
		
		scanner.close();
	}

}
