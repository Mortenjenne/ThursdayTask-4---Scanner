import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
    private static int counter = 0;
	
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
    if (scanner.hasNextInt()) {
        counter++;

        // Read user input
        int userGuess = scanner.nextInt();

        // Compare it with the random number
        if(userGuess == rnd_number) {
             // Let the user know the result of the comparison
            System.out.println("You guessed correct! Congratulations, you used " + counter + " guesses.");
            return;

        } else { 

            System.out.println("Incorrect guess!");

        // Help the user by revealing wether the guess was lower or higher than the target number
        if(userGuess < rnd_number) {
            System.out.println("The number is greater than your guess");

        } else { 

            System.out.println("The number is less than your guess");
        }

        // Let the user try again by calling this method recursively
        makeAGuess();

        }

    } else {
    // if input was not numeric show an error message and call this method recursively
    System.out.println("Please enter a number between 1 and 100");

    makeAGuess();  
    }
    
       
    }
}