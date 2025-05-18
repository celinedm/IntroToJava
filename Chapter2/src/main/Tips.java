package main;

import java.util.*;

//calculating the tips
public class Tips {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the subtotal: ");
		double subtotal = scanner.nextDouble();
		
		System.out.println("Enter the gratuity rate: ");
		double rate = scanner.nextDouble();
		
		double gratuity = subtotal * (rate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}
