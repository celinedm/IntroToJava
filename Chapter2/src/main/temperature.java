package main;
	import java.util.Scanner;
	
	
	
public class temperature {

	//Convert the celcius into farenheiht
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter a degree in Celcius: ");
			double celcius = scanner.nextDouble();
			
			double fahrenheit = (9.0 / 5.0) * celcius + 32;
			System.out.println(celcius + " in Fahrenheit is " + fahrenheit);
			
			scanner.close();
		}


}
