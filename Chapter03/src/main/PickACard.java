package main;

import java.util.*;

public class PickACard {
	public static void main(String[] args) {
		
		String[] suits = {"Hearts" , "Diamonds" , "Clubs" , "Spades"};
		String[] ranks = {"Ace", "2", "3", "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pick a card 1 - 52");
		int card = scanner.nextInt();
		
		int cardNumber = card - 1;
		int suit = cardNumber / 13;
		int rank = cardNumber % 13;
		
		System.out.println("You picked the " + ranks[rank] + " of " + suits[suit]);
		 
		scanner.close();
	}
}
