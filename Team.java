package team;

import play.Player;

public class Team {

	// First u create class the first and then include the data base.
	private String name;
	private Player player;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String name, Player player) {
		super();
		this.name = name;
		this.player = player;
	}
	//Include appropriate getters, setters and constructors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", player=" + player + "]";
	}

}
