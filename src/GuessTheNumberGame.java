import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    //object initialization of the object
    private Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static int randomNumber;
    private static int userGuess;
    private static int numberOfTries;

    private GuessTheNumberGame() {
        randomNumber = random.nextInt(100);
    }

    //method the take input from user...
    private static void takeUserInput() {
        System.out.println("Enter your Guess:");
        userGuess = sc.nextInt();
        numberOfTries++;
    }

    //here we will check the userGuess is correct or not
    private static void isCorrectNumber() {
        while (true) {
            if (userGuess > randomNumber) {
                System.out.println("Number is Smaller");
                takeUserInput();
            } else if (userGuess < randomNumber) {
                System.out.println("Number is Greater");
                takeUserInput();
            } else if (userGuess == randomNumber) {
                System.out.println("Your Guess is Correct!!! The Number is : " + randomNumber);
                System.out.println("Number of Tries Required : " + numberOfTries);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game");
        GuessTheNumberGame obj = new GuessTheNumberGame();
        takeUserInput();
        isCorrectNumber();
    }
}