package main;


import java.util.*;

//Computing the volume of a cylinder
public class cylinder {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Radius: ");
		double radius = scanner.nextDouble();
		
		System.out.println("Enter the Length: ");
		double length = scanner.nextDouble();
		
		
		double area = (radius * radius * Math.PI);
		double volume = (area * length);
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
		
	}
}
