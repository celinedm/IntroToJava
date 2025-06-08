package main;

import java.util.*;

public class ASCII {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code (0 - 127)");
		
		if (scanner.hasNextInt()) {
			
			int code = scanner.nextInt();
			
			if (code >= 0 && code <= 127) {
				
				char character = (char) code;
				
				System.out.println(code + " is " + character);
				
			}else {
					System.out.println("Enter an integer between 0 to 127");
				}
				
			} else {
				System.out.println("Invalid integer");
		}
		scanner.close();
		
	}

}
