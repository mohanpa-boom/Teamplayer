package team;

import play.Player;

public class TeamBo {
// In this method the string data using Split method defined 
	
//	In the string class and and construct a team object
	
	public Team createTeam(String data, Player[] PlayerList) {
		String pt[]=data.split(",");
		Player player=null;
		
		//Iterate through the playerList and get the player object reference.
		for(Player p:PlayerList) {
			if(p.getName().equals(pt[1])) {
				player=p;
				break;
			}
		}
		
		Team team =new Team(pt[0], player);
		return team;
	}
}


