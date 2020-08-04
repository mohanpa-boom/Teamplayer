package main;

import java.util.Scanner;

import match.Match;
import match.MatchBo;
import play.Player;
import play.PlayerBo;
import team.Team;
import team.TeamBo;

public class Main  {

	private static String continueString;

	public static void main(String[] args) {
		
		//In this method  countinueString option can be used/
		
		String continueString=null;
		
		//n the main method, create an array of Player instances /
		//objects, an array of Team instances /
		//objects and an array of Match instances objects/
		
		
		Player[] player=new Player[12];
		Team[] team=new Team[12];
		Match[] match =new Match[24];
		int playerarraycount=0,teamarraycount=0,matcharraycount=0;
		PlayerBo playerbo=new PlayerBo();
		TeamBo teambo=new TeamBo();
		MatchBo matchbo=new MatchBo();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		//In this method ,I have to  create the Player Details/
		
		System.out.println("enter the player count");
		int playercount=sc.nextInt();
		for(int i=0;i<playercount;i++) {
			System.out.println("enter player details");
			String playerdetails=sc.next();
			Player pt=playerbo.createPlayer(playerdetails);
			player[playerarraycount]=pt;
			playerarraycount++;
			System.out.println("player created" +pt);
		}
		//In this method ,I have to  create the Team Details/
		
		System.out.println("enter the Team count");
		int teamcount=sc.nextInt();
		for(int i=0;i<teamcount;i++) {
			System.out.println("enter team details");
			String teamdetails=sc.next();
			Team pt1=teambo.createTeam(teamdetails, player);
			team[teamarraycount]=pt1;
			teamarraycount++;
			System.out.println("team created"+pt1);
	}
		
		//In this method ,I have to  create the Match Details/
		       
        System.out.println("enter the match count");
        int matchcount=sc.nextInt();
        for(int i=0;i<matchcount;i++) {
	        System.out.println("enter match details");
	        String matchdetails=sc.next();
	        Match m=matchbo.createMatch(matchdetails, team);
	        match[matcharraycount]=m;
	        matcharraycount++;
	        System.out.println("match created"+m);
	        }
        
        
      // in this condition d0-while-loop is executed at least once because is checked after loop//  
        
do {
	
	System.out.println("1.Find Team ");
	System.out.println("2.Find All Matches In A Specific Venue ");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:
		System.out.println("enter date");
	    String matchdate=sc.next();
	    matchbo.findTeam(matchdate, match);
	    break;
	    
	    case 2:
		System.out.println("Enter Team Name ");
	    String teamname=sc.next();
	    matchbo.findAllMatchesOfTeam(teamname, match);
	    break;
	    }
	System.out.println("do you want to continue yes or no");
	continueString=sc.next();
	}
while
	(continueString.equals("yes"));
	System.out.println("exit");
}
}
