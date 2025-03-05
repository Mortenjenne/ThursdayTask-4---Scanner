//1.a create class Main with a main method
class Main {
	
	public static void main(String[] args) {

		//1.g In the main method in the Main class, create an instance of the Team class (i.e. instantiate the Team class).
		//1.k Create 5 more Team instances and
		Team team1 = new Team("Real Madrid");
		Team team2 = new Team("FC Barcelona");
		Team team3 = new Team("Atletico Madrid");
		Team team4 = new Team("Atletico Bilbao");
		Team team5 = new Team("Villareal");
		Team team6 = new Team("Betis");

		//1.i From the main method, call the method setRank() on the instance of Team you created in step 1.g with a number of your choice.
		team2.setRank(1);
		team3.setRank(2);
		team1.setRank(3);
		team4.setRank(4);
		team5.setRank(5);
		team6.setRank(6);

		//added method to add a whole team
		team1.addPlayers("Kylian Mbappe", "Vinicius Junior", "Jude Bellingham", "Federico Valverde", "Brahim Diaz", "Luka Modric", "Eduardo Camavinga", "Antonio Rudiger", "Daniel Carvajal", "Lucas Vasquez", "Thibaut Courtois");
		team2.addPlayers("Lamine Yamal", "Robert Lewandowski", "Raphina", "Pedri", "Ronald Araujo", "Frenkie de Jong", "Marc-Andre ter Stegen", "Andreas Christensen", "Inigo Martinez", "Jules Kounde", "Dani Olmo");

		//1.l Call the method addPlayer() and give it a suitable parameter.
		team3.addPlayer("Antonio Griezmann");

		//1.k From the main method, print them using their toString() method.
		System.out.println(team1);
		System.out.println("");

		System.out.println(team2);
		System.out.println("");

		System.out.println(team3);
		System.out.println("");

		System.out.println(team4);
		System.out.println("");

		System.out.println(team5);
		System.out.println("");

		System.out.println(team6);

		
		

		
		

	}
}