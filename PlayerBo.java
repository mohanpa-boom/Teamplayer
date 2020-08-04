package play;

//In this method, construct a player object.Split the comma seperated input.

public class PlayerBo {
	public Player createPlayer(String data) {
		String pt[]=data.split(",");
		Player player=new Player(pt[0], pt[1], pt[2]);
		return player;
		
	}
}
