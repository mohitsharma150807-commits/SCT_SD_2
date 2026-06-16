import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100:");
        int guess = sc.nextInt();

        // Compare the guess with the random number
        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else if (guess < randomNumber) {
            System.out.println("Too low! The correct number was " + randomNumber);
        } else {
            System.out.println("Too high! The correct number was " + randomNumber);
        }

        sc.close();
    }
}
