package Lec2;

import java.util.Random;
import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        while (Math.abs(userScore - computerScore) < 2) {
            int computerChoice = random.nextInt(3);

            System.out.print("Enter your choice (0 for scissor, 1 for rock, 2 for paper): ");
            int userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                continue;
            }

            String computerChoiceString = "";
            String userChoiceString = "";

            switch (computerChoice) {
                case 0:
                    computerChoiceString = "scissor";
                    break;
                case 1:
                    computerChoiceString = "rock";
                    break;
                case 2:
                    computerChoiceString = "paper";
                    break;
            }

            switch (userChoice) {
                case 0:
                    userChoiceString = "scissor";
                    break;
                case 1:
                    userChoiceString = "rock";
                    break;
                case 2:
                    userChoiceString = "paper";
                    break;
            }

            System.out.println("Computer's choice: " + computerChoiceString);

            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Your score: " + userScore);
            System.out.println("Computer's score: " + computerScore);
            System.out.println();
        }

        if (userScore > computerScore) {
            System.out.println("Congratulations! You win the game!");
        } else {
            System.out.println("Sorry, you lose the game. Better luck next time!");
        }
    }
    
}
