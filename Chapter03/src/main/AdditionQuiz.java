package main;

//Adding a third Integer in an addition quiz

import java.util.*;
public class AdditionQuiz {
	public static void main(String[] args) {
		
		int firstNumber = (int)(Math.random() * 20);
		int secondNumber = (int)(Math.random() * 20);
		int thirdNumber = (int)(Math.random() * 20);
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println(
				"What is " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " +  " ? ");
		
		int answer = input.nextInt();
		
		System.out.println(
				firstNumber + " + " + secondNumber + " + "  + thirdNumber + " = "  + answer + " is " +
				(firstNumber + secondNumber + thirdNumber == answer));
		input.close();
	}
}
