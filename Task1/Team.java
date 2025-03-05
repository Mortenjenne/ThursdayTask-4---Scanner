import java.util.ArrayList;
import java.util.Arrays;

//1.b Create an entity class called Team
class Team {

	//1.c Add a private instance variable/attribute to Team to hold the team's name.
	private String teamName;

	//1.d Add another private instance variable to hold the team's rank (some number).
	private int teamRank;

	//1.e Add yet another private instance variable to hold the names of players in the team.
	private ArrayList<String> players;

	
    //1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name. 
	public Team(String teamName) {

    this.players = new ArrayList<>();
    this.teamName = teamName;
	}

    //1.h In the Team class add a method called setRank() that takes a number as parameter and assigns it to the rank attribute.
	public void setRank(int teamRank) {
		this.teamRank = teamRank;
	}
    
    //1.j In the Team class add a toString() method that returns a String formated like this:
	public String toString() {
		String s = "Hold: " + this.teamName + ", LaLiga rang: " + this.teamRank  + "\nSpillere:";
		for(String player: players) {
			s += "\n" + player;
		}
		return s;

	}

	//1.l Add a new method to the class, which adds a name to this list.
	public void addPlayer(String player) {
		players.add(player);
	} 

	public void addPlayers(String... playerNames) {
		players.addAll(Arrays.asList(playerNames));
	}

}