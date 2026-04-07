import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        while (playAgain) {

            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("\n New Round Started!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it!");
                    guessed = true;
                    score += (maxAttempts - attempts + 1) * 10;
                    roundsWon++;
                    break;

                } else if (guess > number) {
                    System.out.println("Too high!");

                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessed) {
                System.out.println("You lost! The number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n Game Over!");
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Total Score: " + score);

        sc.close();
    }
}