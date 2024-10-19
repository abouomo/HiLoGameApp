package hilo;

import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		Scanner scanner = new Scanner(System.in);

		boolean playAgain = true;

		while (playAgain) {
			
			int theRandomNumber = (randomNumber.nextInt(20) + 1);

			int maxTries = 5;

			System.out.println("Please enter a number between 1 and 20 ");
			int userGuess = scanner.nextInt();

			if (userGuess == theRandomNumber) {
				System.out.println("You won!");
			} else if ((userGuess > theRandomNumber)) {
				System.out.println("Your guess is too high");
			} else if ((userGuess < theRandomNumber)) {
				System.out.println("Your guess is too low");
			}
			
			System.out.println("Do you want to play again? yes or no");
			String response = scanner.nextLine();
			if (response.equalsIgnoreCase("yes")) {
				return;
			} else if (response.equalsIgnoreCase("no")) {
				playAgain = false;
			}
		}
		
		scanner.close();

	}

}
