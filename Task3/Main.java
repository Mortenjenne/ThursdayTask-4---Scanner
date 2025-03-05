import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object
    Scanner scanner = new Scanner(System.in);

    // use hasNextDouble to check if input is numeric, 
    // if so...
    if (scanner.hasNextDouble()) {

        // Read user input
        double number = scanner.nextDouble();

        // Compare it with the random number
        if(number == rnd_number) {
             // Let the user know the result of the comparison
            System.out.println("You guessed correct! Congratulations");
        } else if (number != rnd_number) {
            System.out.println("Guess incorrect");


        // Let the user try again by calling this method recursively
        makeAGuess();

        // Help the user by revealing wether the guess was lower or higher than the target number
        if(rnd_number <= number) {
            System.out.println("The number is less than your guess");
        } else if (rnd_number >= number) {
            System.out.println("The number is greater than your guess");
        }

        }

    } else {
    // if input was not numeric show an error message and call this method recursively
    System.out.println("Please enter a number between 0 and 100");
    makeAGuess();  
    }
    
    
        
    }
}