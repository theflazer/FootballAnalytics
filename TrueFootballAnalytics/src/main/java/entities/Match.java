package entities;

import analytics.*;

public class Match {
	private Team homeTeamName;
	private Team awayTeamName;
	private int homeGoals;
	private int awayGoals;
	private int homeShots;
	private int awayShots;
	private int homeSaves;
	private int awaySaves;
	private int homeP;
	private int awayP;
	
	
	public Match(Team hTeam, Team aTeam, int hGoals, int aGoals, int hShots, int aShots, int hSaves, int aSaves, int hP, int aP){
		homeTeamName = hTeam;
		awayTeamName = aTeam;
		homeGoals = hGoals;
		awayGoals = aGoals;
		homeShots = hShots;
		awayShots = aShots;
		homeSaves = hSaves;
		awaySaves = aSaves;
		homeP = hP;
		awayP = aP;
		UpdateHelper.updateStats(this);
	}
	
	public Team getHomeTeam(){
		return homeTeamName;
	}
	
	public Team getAwayTeam(){
		return awayTeamName;
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
	
	public String toString(){
		return homeTeamName.getName() + " " + awayTeamName.getName() + " " + homeGoals + " " + awayGoals + " " +homeShots + " "+ awayShots + " " + homeSaves +" " + awaySaves + " " + homeP + " " + awayP;
	}

}
