package main;

import java.util.*;

public class ThreeIntegers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three integers");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(a > c) {
			int temp = a;
			a = c;
			c = temp;
		}
		
		if(b > c){
			int temp = b;
			b = c;
			c = temp;
		}	
		System.out.println(a + " " +  b + " " + c);
		scanner.close();
	}

	
}
