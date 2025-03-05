import java.util.Scanner;

//2.a: create a Main class with a main method.
class Main {

	public static void main(String[] args) {

		//2.c: Create a Scanner object for reading from the command line
		Scanner scanner = new Scanner(System.in);

		//2.b: In the main method start by printing this message to the user: "Please type your name".
		System.out.print("Please type your name: ");

		//2.d: Declare a String variable name and assign to it whatever is returned from a call to scanner's nextLine()
		String name = scanner.nextLine();

		//2.e: Print the name of the user in a greeting (i.e. "Hello <name>") followed by the message "Please type your age"
		System.out.println("Hello " + name);

		System.out.print("Please type your age: ");

		//2.f: Declare another variable of type int called age and assign to it the value returned by the nextInt()
		int age = Integer.parseInt(scanner.nextLine());

		//2.g: Print the value the user writes (the age variable) i.e. like this: "You are <age> years old".
		System.out.println("You are " + age + " years old");

		//2.h: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. 
		//You may assume retirement starts at age 67. Print the result (i.e. like this: "You have <x> years until retirement").
		int yearsUntilRetirement = 67-age;
		System.out.println("You have " + yearsUntilRetirement + " years until retirement");

	}
}