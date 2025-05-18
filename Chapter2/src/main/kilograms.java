package main;

import java.util.*;


//converting pounds to kilograms
public class kilograms {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number in pounds: ");
		double pounds = scanner.nextDouble();
		
		double kilograms= (pounds * 0.454);
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}

}
