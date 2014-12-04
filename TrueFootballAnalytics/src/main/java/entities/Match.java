package entities;

import analytics.*;

public class Match implements MatchInterface {
	private TeamInterface homeTeam;
	private TeamInterface awayTeam;
	private int homeGoals;
	private int awayGoals;
	private int homeShots;
	private int awayShots;
	private int homeSaves;
	private int awaySaves;
	private int homeP;
	private int awayP;
	
	
	public Match(TeamInterface hTeam, TeamInterface aTeam, int hGoals, int aGoals, int hShots, int aShots, int hSaves, int aSaves, int hP, int aP){
		homeTeam = hTeam;
		awayTeam = aTeam;
		homeGoals = hGoals;
		awayGoals = aGoals;
		homeShots = hShots;
		awayShots = aShots;
		homeSaves = hSaves;
		awaySaves = aSaves;
		homeP = hP;
		awayP = aP;
	}
	
	public TeamInterface getHomeTeam(){
		return homeTeam;
	}
	
	public TeamInterface getAwayTeam(){
		return awayTeam;
	}
	public int gethomeGoals(){
		return homeGoals;
	}
	
	public int getawayGoals(){
		return awayGoals;
	}
	
	public int gethomeShots(){
		return homeShots;
	}
	
	public int getawayShots(){
		return awayShots;
	}
	
	public int gethomeSaves(){
		return homeSaves;
	}
	
	public int getawaySaves(){
		return awaySaves;
	}
	
	public int gethomeP(){
		return homeP;
	}
	
	public int getawayP(){
		return awayP;
	}
	
	public void displayString(){
		System.out.println(homeTeam.getName() + " " + awayTeam.getName() + " " + homeGoals + " " + awayGoals + " " +homeShots + " "+ awayShots + " " + homeSaves +" " + awaySaves + " " + homeP + " " + awayP); 
	}

}
