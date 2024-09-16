
import java.util.Scanner;
import java.util.Random;

    public class Number_Guess {

        // Method to play a single round of the game
        public static int playRound(int maxAttempts) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;  // Generates a random number between 1 and 100
            int attempts = 0;
            int score = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number correctly in " + attempts + " attempts.");
                    score = (maxAttempts - attempts + 1) * 10; // Higher score for fewer attempts
                    System.out.println("Your score for this round is: " + score);
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low!");
                } else {
                    System.out.println("Your guess is too high!");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was: " + numberToGuess);
                }
            }

            return score;
        }

        // Main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalScore = 0;
            int maxAttempts = 7;  // Number of allowed attempts per round
            int rounds = 0;

            System.out.println("Welcome to the Guess the Number Game!");
            System.out.print("How many rounds would you like to play? ");
            rounds = scanner.nextInt();

            for (int i = 1; i <= rounds; i++) {
                System.out.println("\n### Round " + i + " ###");
                int roundScore = playRound(maxAttempts);
                totalScore += roundScore;
                System.out.println("Total score after round " + i + ": " + totalScore);
            }

            System.out.println("\nGame Over! Your final score is: " + totalScore);
        }
    }



