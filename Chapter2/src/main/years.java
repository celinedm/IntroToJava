package main;

import java.util.*;

public class years {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		
		int hours = minutes / 60;
		
		int days = hours / 24;
		
		int years = days / 365;
		int day = days % 365;
		
		int hour = hours % 24;
		
		System.out.println(minutes + " minutes is approximately " + years + " years, " + day + " days," + " and " + hour + " hour(s)");
		
		
		
	}
}
