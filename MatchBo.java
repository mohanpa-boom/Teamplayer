package match;

import team.Team;

public class MatchBo {
	private Team team;

	//In this method the string data using Split method defined in the string class and and construct a Match object.
	
	public Match createMatch(String data, Team[] teamList) {
		String ptMatch[]=data.split(",");
		Team pt=new Team();
		Team pt1=new Team();
		
		// Iterate through the teamList and get the team object reference.
		for(Team tm:teamList) {
			if(tm.getName().equals(ptMatch[1])) {
				pt.setName(ptMatch[1]);
				break;
				}
			}	 
		
		//Iterate through the teamList and get the team object reference.
		for(Team tm:teamList) {
			if(tm.getName().equals(ptMatch[2])) {
				pt1.setName(ptMatch[2]);
				break;
				}
			}
		Match match=new Match(ptMatch[0],pt,pt1,ptMatch[3],pt1);
		
		
		//Override the ToString() method to display the match details in the format specified in the output.
		
		//Use this format String.format("%-15s %-15s %-15s %s", to display match.
		
		String output=String.format("%-15s %-15s %-15s %s",ptMatch[0],pt.getName(),pt1.getName(),ptMatch[3]);
		System.out.println(output);
		return match;
		}
	
	//In this method, find the Team  that plays a particular match.
	public Team findTeam(String matchDate, Match[] matchList) 
	{
		Team pt=null;
		Team pt1=null;
		for(Match m:matchList) 
		{
			if(m.getDate().equals(matchDate))
			{
				pt=m.getTeamone();
				pt1=m.getTeamtwo();
				System.out.print(pt.getName()+","+pt1.getName());
				System.out.println();
				break;
			}
			}
		return team;
		}
	
	//In this method, display all matches of the given team teamName.
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match match :matchList) {
			if((match.getTeamone().getName().equals(teamName))) {
				System.out.println(match.getDate()+"\n"+match.getTeamone().getName()+"\n"+match.getTeamtwo().getName()+"\n"+match.getVenue()+"\n"+match.getTeam());
				break;
				}	
			}
		for(Match match :matchList) {
			if((match.getTeamtwo().getName().equals(teamName))) {
				System.out.println(match.getDate()+"\n"+match.getTeamone().getName()+"\n"+match.getTeamtwo().getName()+"\n"+match.getVenue()+"\n"+match.getTeam());
			}
			break;
			}	
		}
	}

