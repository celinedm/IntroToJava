package main;

import java.util.*;

public class GreatCircleDistance {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: " );
		
		double Lat1 = Math.toRadians(scanner.nextDouble());
		double Long1 = Math.toRadians(scanner.nextDouble());
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double Lat2 = Math.toRadians(scanner.nextDouble());
		double Long2 = Math.toRadians(scanner.nextDouble());
		
		
		//The average radius of the Earth is 6,371.01
		double d = 6371.01 * 
				Math.acos(((Math.sin(Lat1)*Math.sin(Lat2)) + (Math.cos(Lat1) * Math.cos(Lat2)) * Math.cos(Long1- Long2)));
		
		System.out.println("The distance between the two points is " + d + " km");
		
		scanner.close();
	}

}
