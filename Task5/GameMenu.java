import java.util.ArrayList;
import java.util.Scanner;

//4.a Create an entity class called GameMenu.
class GameMenu{

	//4.b Add a private instance variable actions with the type ArrayList<String> to the class.
	private ArrayList<String> actions;
	
	//4.c Add a constructor with a parameter of the type ArrayList to the constructor. 
	//This is so that objects of the GameMenu class can be instantiated with a list of actions.(shown in step 4.f)
	public GameMenu(ArrayList<String> actions) {

		this.actions = actions;

	}

	//4.h In the GameMenu class add a method displayMenu() that prints out the elements of the actions attribute.
	public void displayMenu() {
		for(String action: this.actions) {
			System.out.println(action);
		}
	}

	//5.a Create a method in the GameMenu class getAction()
	// that prints the sentence "Type a number to choose an action" and then prints each elements in the actions attribute.
	public String getAction() {

		//5.b Next, in the getAction() method, create a new Scanner object. Declare a variable String choice and assign it the user's input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number to choose an action ");

		displayMenu();

		String choice = sc.nextLine();
		return choice;
	}
}