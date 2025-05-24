package main;

import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		String[] choices = 
			{"Rock", "Paper", "Scissors"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("0. Rock | 1. Paper | 2. Scissors");
		
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3);
		
		if(user == computer) {
			System.out.println("It's a tie! You chose " + choices[user] + " and the computer chose " + choices[computer]);
		}else if(
				(user == 0 && computer == 2) || //Rock beats scissors
				(user == 1 && computer == 0) || //Paper beats rock
				(user == 2 && computer == 1)) {
			System.out.println("You won! " + choices[user] + " beats " + choices[computer]);
		}else {
			System.out.println("You lost! Computer chose " + choices[computer] + " and you chose " + choices[user] );
		}
		input.close();
	}
}
