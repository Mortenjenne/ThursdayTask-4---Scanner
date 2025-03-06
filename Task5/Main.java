import java.util.ArrayList;

//4.e Create a client class, Main with a main method. (You will use this class to test the GameMenu class).
class Main{
	
	public static void main(String[] args) {

        //4.f In the main method create an ArrayList<String> called actions. 
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		//4.g Still in the main method, instantiate theGameMenu class with the actions list as an argument to the constructor.
		GameMenu menu = new GameMenu(actions);

        //4.i From the main method in Main test the displayMenu() method by calling it on the GameMenu instance created in step 4.g.
		//gameMenu.displayMenu();
		

		//5.d In the main method of the Main class, call the getAction() saving the return value n a variable.
		String userChoice = menu.getAction();


		//5.g In step 5.d you created a variable called userChoice with the type String. 
		int userInput = Integer.parseInt(userChoice);

		//Convert the value to an int before using it as an argument in a call to the doAction() method.
		doAction(userInput, menu);

		}//main
		
		//5.e Create a new method in the Main class for printing the message that corresponds to the action the user has chosen.
		public static void doAction(int action, GameMenu menu){

			//5.f In the body of the doAction() method, write a switch-case with a case for each of the 4 options added in step
			switch(action) {
			case 1:
				System.out.println("Starting the game now");
				break;

			case 2:
				System.out.println("Fetching previously saved game data");
				break;

			case 3:
				System.out.println("Game paused");
				break;

			case 4:
				System.out.println("Ending game");
				break;

			default:
				System.out.println("Invalid choice. Please try again");

				String newChoice = menu.getAction(); //Call getAction() again
				int newUserInput = Integer.parseInt(newChoice);

				doAction(newUserInput, menu); //Retry with new choice
				break;

			}
		}
}//class Main